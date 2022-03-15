package day05;

import java.util.ArrayList;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * 반환유형
		 * 1. 메서드가 실행결과를 돌려주는 값에 대한 type
		 * 2. 메서드가 반환유형이 없다면 void라고 적습니다.
		 * 3. void형 메서드에서도 return키워드 사용이 가능합니다.
		 */
		
		int result = add( add(1,2) , add(3, 4) );
		System.out.println(result);
		System.out.println( add(3, 7) );
		
		//void형 메서드는 단순 호출만 가능함.
		sub(1, 2);
		//int x= sub(1,2);
		//System.out.println( sub(1,2) );
		
		noReturn("바보");
		
	}
	static int add(int a, int b) {
		return a + b;
	}
	//반환이 없는 메서드
	static void sub(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b) );		
	}
	
	static void noReturn(String s) {
		if(s.equals("바보") ) {
			System.out.println("바보를 전달했으므로 메서드를 종료합니다");
			return;
		}
		
		System.out.println(s + "가 아닌 '바보'를 전달하세요");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
