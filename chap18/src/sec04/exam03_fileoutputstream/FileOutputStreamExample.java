package sec04.exam03_fileoutputstream;

import java.io.*;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec04/exam03_fileoutputstream/lizimg.jpg";
		String targetFileName = "c:/Temp/liz.jpg"; 
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
