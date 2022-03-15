package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered(성능향상) + Reader(2바이트 단위)
		 * 
		 */
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test3.txt"));
			/*
			System.out.println(br.readLine() );
			System.out.println(br.readLine() );
			System.out.println(br.readLine() );
			*/
			
			//BufferedReader에는 readLine() 매서드가 있고, 한줄을 통째로 읽는다.
			String str;
			while((str = br.readLine()) != null) {
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
