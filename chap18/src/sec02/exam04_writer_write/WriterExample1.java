package sec02.exam04_writer_write;

import java.io.*;

public class WriterExample1 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "채수병".toCharArray();
		for(int i = 0; i<data.length; i++) {
			writer.write(data[i]); //"채", "수", "병"을 하나씩 출력
		}
		writer.flush();
		writer.close();
	}
}
