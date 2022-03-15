package exception.throws_;

public class MainClass {

	public static void main(String[] args) /* throws Exception*/ {
		
		//main이 예외를 처리하게 되면 자바 vm으로 넘어감.
		try {
			ThrowsEx02 th = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		
	
	}
}
