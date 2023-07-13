package verify.exam07;

import java.io.*;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec05/exam04_bufferedreader/BufferedReaderExample.java";
	
		FileInputStream fis = new FileInputStream(filePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		int rowNumber = 0;
		String rowData;
		while( (rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + ":" + rowData);
		}
		
		fis.close();
		isr.close();
		br.close();
	}
}
