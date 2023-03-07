package sec04.exam01_arithmetic;

public class CharOperationExample {
	
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		System.out.println(c1);
		
		char c2 = 'A';
		// char c3 = c2 + 1; //컴파일 에러 {c2가 int type으로 변환 
		// -> c2 + 1이 int type이 됨-> char(2) != int(4)}
		int result = c2 + 1;
		System.out.println(result);
		
		char c3 = (char) result;
		System.out.println(c3);
	}
	
}
