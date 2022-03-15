package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		/*
		 * Buffered가 붙은 성능향상 입력 스트림
		 * InputStream은 바이트 기반으로 읽는다.
		 */
		
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test2.txt");
			
			bis = new BufferedInputStream(fis);
			
			int result;
			while((result = bis.read()) != -1) { //더 이상 읽을 데이터가 없으면 -1 반환
				System.out.print( (char)result );
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
				fis.close();
				bis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			
			}
		}
	}
}
