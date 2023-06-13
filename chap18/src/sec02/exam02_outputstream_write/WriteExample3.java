package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes("utf-8");	
		os.write(data, 1, 2); //"BC"만 출력
		os.flush();
		os.close();
	}
}
