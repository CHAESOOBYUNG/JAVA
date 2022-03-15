package day06;

public class Variable {

	int a = 10;
	//a = 10; //문법이 허용되지 않음
	
	void printNum(int c) {
		int b = 1;
		
		System.out.println("지역변수:" + b);
		System.out.println("멤버변수:" + a); //초기값 지정이 없다면 기본형으로 자동 초기화
		System.out.println("매개변수:" + c);
		
	}
	
}
