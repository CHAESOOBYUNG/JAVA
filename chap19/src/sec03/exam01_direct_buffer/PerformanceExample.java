package sec03.exam01_direct_buffer;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.*;

public class PerformanceExample {
	public static void main(String[] args) throws Exception {
		Path form = Paths.get("src/sec03/exam01_direct_buffer/ive1.jpg");
		Path to1 = Paths.get("src/sec03/exam01_direct_buffer/ive2.jpg");
		Path to2 = Paths.get("src/sec03/exam01_direct_buffer/ive3.jpg");
		
		long size = Files.size(form);
		
		FileChannel fileChannel_form = FileChannel.open(form);
		FileChannel fileChannel_to1 = FileChannel.open(to1, 
			EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		
		FileChannel fileChannel_to2 = FileChannel.open(to2, 
			EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		
		//넌 다이텍트 버퍼와 다이렉트 버퍼 생성 
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate((int) size);
		ByteBuffer directBuffer = ByteBuffer.allocateDirect((int) size);
		
		long start, end;
		
		//넌 다이렉트 버퍼 테스트
		start = System.nanoTime();
		for(int i = 0; i < 100; i++) {
			fileChannel_form.read(nonDirectBuffer);
			nonDirectBuffer.flip();
			fileChannel_to1.write(nonDirectBuffer);
			nonDirectBuffer.clear();
		}
		end = System.nanoTime();
		System.out.println("넌 다이렉트: \t" + (end - start) + " ns");
		
		fileChannel_form.position(0); //파일의 위치를 0으로 설정(처음으로 돌림)
		
		//다이렉트 버퍼 테스트
		start = System.nanoTime();
		for(int i = 0; i < 100; i++) {
			fileChannel_form.read(directBuffer);
			directBuffer.flip();
			fileChannel_to2.write(directBuffer);
			directBuffer.clear();
		}
		end = System.nanoTime();
		System.out.println("다이렉트: \t" + (end - start) + " ns");
		
		fileChannel_form.close();
		fileChannel_to1.close();
		fileChannel_to2.close();
	}
}
