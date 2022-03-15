package exception.throws_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드, 생성자에서 발생되는 예외를 호출부로 떠넘기는 키워드가 throws입니다.
		 * throws구문이 붙어있는 메서드, 생성자를 호출할 때는 예외처리를 대신 진행해야 합니다.
		 * 
		 * 즉, 예외처리를 강요할 때 사용합니다.
		 */
		
		try {
			greeting(10);
		} catch (Exception e) {
			System.out.println("예외처리를 대신 진행");
		}
		
		
		//throws처리가 되어있는 메서드 예시
		try {
			Class.forName("#$%");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		}
		
		//throws처리가 되어있는 생성자 예시
		try {
			new FileInputStream(new File("xx"));
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}
		
	}
	
	//멤버변수
	public static String[] arr = {"안녕하세요", "hello", "니하오" };
	public static void greeting(int index) throws Exception  {
		System.out.println(index + "번째값:" + arr[index]);
		
	}
	
	
}
