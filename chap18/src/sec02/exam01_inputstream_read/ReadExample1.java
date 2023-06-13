package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte;
		/* while( (readByte = is.read()) != -1) { //InputStream으로부터 바이트를 읽을 수 없을 때 까지 진행
			System.out.println((char)readByte);
		} */
		while(true) {
			readByte = is.read(); //InputStream으로부터 1바이트를 읽고 4바이트 int 타입으로 리턴
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
		is.close();
	}
}
