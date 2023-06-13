package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo; //read 메소드가 읽은 바이트 수 저장
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3); //inputStream으로부터 2개의 바이트 만큼 읽고 3개까지 저장
		for(int i = 0; i < readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
