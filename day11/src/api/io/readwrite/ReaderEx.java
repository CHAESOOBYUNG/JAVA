package api.io.readwrite;

import java.io.FileReader;

public class ReaderEx {

	public static void main(String[] args) {
		
		/*
		 * 문자 기반으로 읽어들이는 클래스는 FileReader클래스 입니다.
		 * 2바이트 단위로 읽기 때문에 문자를 읽기에 적합합니다.
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test.txt");
			
//			int result = fr.read();
//			System.out.println( (char)result );
			
			
			int result;
			fr.read();
			while( (result = fr.read()) != -1) {
				System.out.println((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
