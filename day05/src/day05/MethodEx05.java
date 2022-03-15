package day05;

public class MethodEx05 {

	public static void main(String[] args) {
		//메서드의 연쇄호출
		test01();
		
		//재귀적 함수(재귀함수)
		recursive(1);
		
		//팩토리얼 5! = 5 * 4 * 3 * 2 * 1
		System.out.println( factorial(5) );
	}

	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	static void test02() {
		System.out.println("2번 메서드 실행");
		
		System.out.println("2번 메서드 종료");
	}
	
	static void recursive(int a) {
		
		if(a == 10) return; //함수 종료(탈출의 조건)
		
		System.out.println(a + "번 호출");
		
		a++;
		recursive(a);
	}
	
	static int factorial(int a) {
	
		if(a == 1) return 1;
		
		return a * factorial(a - 1);
	}
	
	
	
	
}
