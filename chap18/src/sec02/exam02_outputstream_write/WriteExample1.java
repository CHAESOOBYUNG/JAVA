package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample1 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes("utf-8");
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]); //"A", "B", "C"를 하나씩 출력
		}
		os.flush();
		os.close();
	}
}
