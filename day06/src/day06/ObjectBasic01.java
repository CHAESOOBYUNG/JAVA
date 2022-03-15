package day06;

public class ObjectBasic01 {

	public static void main(String[] args) {
		
		//객체를 사용하지 않는 기존방법.
		System.out.println("1번 계산기 사용");
		System.out.println(add(1) );
		System.out.println(add(2) );
		System.out.println(add(3) ); //6
		
		System.out.println("2번 계산기 사용");
		System.out.println(add2(10) );
		System.out.println(add2(20) );
		System.out.println(add2(30) );
	}
	
	//1번 계산기
	static int result = 0;
	static int add(int n) {
		result += n;
		return result;
	}
	
	//2번 계산기
	static int result2 = 0;
	static int add2(int n) {
		result2 += n;
		return result2;
	}
	
	
	
	
	
	
}
