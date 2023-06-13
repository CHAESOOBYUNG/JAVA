package sec02.exam04_writer_write;

import java.io.*;

public class WriterExample3 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "채수병".toCharArray();
		writer.write(data, 1, 2); //"수병"만 출력
		
		writer.flush();
		writer.close();
	}
}
