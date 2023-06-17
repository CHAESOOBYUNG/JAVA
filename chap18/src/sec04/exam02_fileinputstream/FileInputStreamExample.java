package sec04.exam02_fileinputstream;

import java.io.*;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec04/exam02_fileinputstream/FileInputStreamExample.java");
			int data;
			while((data = fis.read()) != -1) { //1byte씩 읽고 콘솔에 출력
				System.out.write(data);
			}
			System.out.flush();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
