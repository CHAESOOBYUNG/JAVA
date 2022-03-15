package api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) {

		/*
		 * 문자열(유니코드)를 이용해서 한글을 저장할 때 사용하는 클래스는 FileWriter클래스 입니다.
		 * 2바이트 단위로 처리하기 때문에 문자를 읽고 쓰기에 적합합니다.
		 * 
		 */
		FileWriter fw = null;
		
		// \r은 커러슬 다시 처음으로(캐리지 리턴, \n 줄바꿈

		try {
			fw = new FileWriter("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test.txt");
			
			String str = "오늘은 2021년 12월 20일 입니다~ \r\n 집에 가고 싶네..";
			fw.write(str);
			
			System.out.println("파일이 정상 출력 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}


	}
}
