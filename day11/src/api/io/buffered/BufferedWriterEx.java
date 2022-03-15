package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered(성능향상) + writer(2바이트 단위)로 쓰는 클래스
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test3.txt"));
			
			System.out.println("한문장>");
			String str1 = scan.nextLine();
			
			System.out.println("두문장>");
			String str2 = scan.nextLine();
			
			bw.write( str1 );
			bw.write( "\r\n" );
			bw.write( str2 );
			
			bw.flush(); //버퍼를 비운다(출력)
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
