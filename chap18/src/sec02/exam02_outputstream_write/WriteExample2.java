
package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes("utf-8");
		os.write(data); //"ABC" 모두 출력
		os.flush();
		os.close();
	}
}
