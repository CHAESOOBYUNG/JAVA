package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReader_Decode {

	public static void main(String[] args) {

		/*
		 * 문서를 읽어올 때, 인코딩(복호화:디코딩) 형식이 다르면, 한글이 깨지는 문제가 발생합니다.
		 * BufferedReader를 이용해서 인코딩 형식을 지정해서 파일을 읽어오는 방법
		 */

		BufferedReader br = null;
		InputStreamReader isr = null;
		FileInputStream fis = null;

		try {
//			fis = new FileInputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test3.txt");
//			isr = new InputStreamReader(fis, "EUC-KR"); //EUC-KR형식으로 DECODING
//			br = new BufferedReader(isr);
			
			String path = "C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test3.txt";
			br = new BufferedReader( new InputStreamReader (new FileInputStream(path) , "EUC-KR"));
			
			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
			}



		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				
			}
		}

	}
}
