package quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 이용해서 파일명을 정확히 입력받습니다.
		 * 
		 * 2. fileupload폴더에 해당파일이 있다면, 해당파일을 file폴더 안으로 복사해서 옮겨주세요.
		 *    혹시 파일이 없다면 "파일명이 없습니다" 예외구문을 출력합니다.
		 *    
		 * 3. 복사도중에 에러가 발생하면 "파일 처리중 예외발생" 구문을 출력합니다.
		 * 
		 * 4. 힌트) InputStream, OutputStream 클래스를 이용하면 됩니다. (예제랑 같음)
		 * 
		 */

		Scanner scan = new Scanner(System.in);


		FileInputStream fis = null;
		FileOutputStream fos = null;


		try {
			System.out.println("읽을 파일명>");
			String name = scan.next();

			fis = new FileInputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\fileupload\\"+ name + ".pdf" );
			fos = new FileOutputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\" + name + ".pdf");

			byte[] arr = new byte[100]; //100바이트 단위로 읽은

			int result; //읽은 길이
			while( (result = fis.read(arr) ) != -1) {
				fos.write(arr, 0, result); //0에서 배열의 길이까지 데이터를 쓴다.
			}

			System.out.println("파일 복사 완료");


		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 예외 발생");
		} finally {
			try {
				fis.close();
				fos.close();
			} catch(Exception e2) {
				
			}
		}
	}
}
