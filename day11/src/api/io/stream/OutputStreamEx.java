package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 쓸 때 사용하는 클래스 FileOutputStream
		 * 2. 생성자의 매개변수로 파일을 쓸 전체경로를 지정합니다.
		 * 3. io패키지 모든 클래스는 생성자에 throws키워드가 있기 때문에 try~catch문과 함께 써야합니다.
		 */

		//파일명과, 문장을 입력받아서, 파일 출력.
		Scanner scan = new Scanner(System.in);

		System.out.println("파일명 입력>");
		String fileName = scan.next();
		
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\" + fileName + ".txt");

			System.out.println("문장을 입력하세요>");
			scan.nextLine(); //next()에 남아있는 엔터값을 제거

			String str = scan.nextLine();

			byte[] arr = str.getBytes(); //문자열의 바이트 데이터를 얻음.
			fos.write(arr); //파일을 바이트 단위로 내려씀
			
			
			


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}






	}

}
