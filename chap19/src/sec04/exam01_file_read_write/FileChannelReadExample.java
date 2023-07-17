package sec04.exam01_file_read_write;

import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;

public class FileChannelReadExample {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:/Temp/file.txt");
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ); //FileChannel 생성
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(100); 
		
		Charset charset = Charset.defaultCharset();
		String data = "";
		int byteCount;
		
		while(true) {
			byteCount = fileChannel.read(byteBuffer); //파일로부터 데이터 읽기
			if(byteCount == -1) break;
			byteBuffer.flip();
			data += charset.decode(byteBuffer).toString();
			byteBuffer.clear();
		}	
		
		fileChannel.close();
		
		System.out.println("file.txt: " + data);
	}
}
