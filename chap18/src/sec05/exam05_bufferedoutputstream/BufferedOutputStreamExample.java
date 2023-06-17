package sec05.exam05_bufferedoutputstream;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1; //읽은 바이트를 저장할 변수
		long start = 0; //복사하기 전 시간 저장할 변수
		long end = 0; //복사한 후 시간 저장할 변수
		
		//BufferedOutputStream 사용 X
		fis = new FileInputStream("C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec05/exam05_bufferedoutputstream/1.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/1.jpg"); //FileOutputStream 직접 사용
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data); //FileOutputStream 직접 사용
		}
		fos.flush();
		end = System.currentTimeMillis();
		fis.close();
		bis.close();
		fos.close();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		
		//BufferedOutputStream 사용 O
		fis = new FileInputStream("C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec05/exam05_bufferedoutputstream/1.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/1.jpg");
		bos = new BufferedOutputStream(fos); //BufferedOutputStream 사용
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data); //BufferedOutputStream 사용
		} 
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용했을 때: " + (end - start) + "ms");
	}
}
