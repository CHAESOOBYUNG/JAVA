package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
	

	/*
	 * Buffered가 붙은 클래스들은 속도향상 입출력 스트림입니다.
	 * OutputStream은 바이트 기반으로 출력을 수행합니다.
	 * 
	 */
	Scanner scan = new Scanner(System.in);

	BufferedOutputStream bf = null;
	FileOutputStream fos = null;
	

	try {
		//fos = new FileOutputStream("C:\\Users\\ChaeSoobyung\\Desktop\\eclipse\\file\\test2.txt");

		//bf = new BufferedOutputStream(fos);

		bf = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\test2.txt"));

		System.out.println("문장을 입력");
		String str = scan.nextLine();


		bf.write(str.getBytes()); //입력받은 문자열의 바이트 데이터를 전달.
		bf.flush(); //모아놓은 버퍼를 내보낸다.

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			fos.close();
			bf.close();

		} catch (Exception e2) {

		}





	}
}
}

