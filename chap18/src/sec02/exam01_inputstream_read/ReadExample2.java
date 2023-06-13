package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo; //read 메소드가 읽은 바이트 수 저장
		byte[] readBytes = new byte[3];
		String data = "";
		/* while((readByteNo = is.read(readBytes)) != -1) {
			readByteNo = is.read(readBytes);
			// System.out.println(readByteNo);
		} */
		
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			// System.out.println(readByteNo);
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}
}
