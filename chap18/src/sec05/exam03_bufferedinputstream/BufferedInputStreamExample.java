package sec05.exam03_bufferedinputstream;

import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		//BufferedStream 사용 X
		FileInputStream fis1 = new FileInputStream("C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec05/exam03_bufferedinputstream/1.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();
		
		//BufferedStream 사용 O
		FileInputStream fis2 = new FileInputStream("C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec05/exam03_bufferedinputstream/1.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2); //버퍼 스트림 생성
		start = System.currentTimeMillis();
		while(fis2.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
		
	}
}
