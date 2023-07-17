package sec05.exam01_asynchronous_filechannel;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class AsynchronousFileChannelWriteExample {
	public static void main(String[] args) throws Exception {
		//스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		for(int i = 0; i < 10; i++) {
			Path path = Paths.get("C:/Temp/file" + i + ".txt");
			Files.createDirectories(path.getParent());
			
			//비동기 파일 채널 생성
			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
				path,
				EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE),
				executorService
			);
			
			//파일에 저장할 데이터를 ByteBuffer에 저장
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode("안녕하세요");
			
			//첨부 객체 생성
			class Attachment {
				Path path; //파일 경로 저장
				AsynchronousFileChannel fileChannel; //비동기 파일 채널 저장
			}
			
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;
			
			//CompletionHandler 객체 생성
			CompletionHandler<Integer, Attachment> completionHandler =
					new CompletionHandler<Integer, Attachment>() {
				public void completed(Integer result, Attachment attachment) {
					System.out.println(attachment.path.getFileName() + " : " + result + " bytes written: " + Thread.currentThread().getName());		
					try {
						attachment.fileChannel.close();
					} catch (IOException e) {}
				};
				
				public void failed(Throwable exc, Attachment attachment) {
					exc.printStackTrace();
					try {
						attachment.fileChannel.close();
					} catch (IOException e) {}
				};
			};
			
			fileChannel.write(byteBuffer, 0, attachment, completionHandler);		
			//(버퍼 객체, 버퍼 인덱스, 첨부 객체, 콜백 메소드를 가진 객체)
		}
		
		//스레드풀 종료
		Thread.sleep(1000);
		executorService.shutdown();
	}
}
