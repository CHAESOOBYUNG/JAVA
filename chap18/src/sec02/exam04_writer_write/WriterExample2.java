package sec02.exam04_writer_write;

import java.io.*;

public class WriterExample2 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "채수병".toCharArray();
		writer.write(data); //"채수병" 모두 출력
		
		writer.flush();
		writer.close();
	}
}
