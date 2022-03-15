package exception.trycatch;

public class TrycatchEx01 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 0;
		
		System.out.println(i+j);
		
		System.out.println(i-j);
		
		try {
			System.out.println(i%j);
			System.out.println("예외 발생시 이 코드는 실행되지 않습니다");
			
		} catch (Exception e) { //catch영역 뒤에는 예외의 종류가 들어갑니다.
			System.out.println("0으로 나누지 마세요!");
		}
		System.out.println(i*j);
		
	}
}
