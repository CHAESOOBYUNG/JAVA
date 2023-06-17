package sec05.exam04_bufferedreader;

import java.io.*;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader); //버퍼 스트림 생성
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);
		
		br.close();
		reader.close();
		is.close();
	}
}
