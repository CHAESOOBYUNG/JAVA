package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
//		//void, 매개변수x 인 print()변경
//		System.out.println("두 수를 입력하세요");
//		//input() 만들고, 2번 호출
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수>");
//		int a = scan.nextInt();
//		System.out.print("정수>");
//		int b = scan.nextInt();
//		//두 수의 합을 리턴하는 add()
//		int result = a + b; //두 수의 합
//		//result를 전달받아서 결과를 출력해주는 show() 
//		System.out.println("두 수의 합:" + result);
		
		print(); //
		int a1 = input();
		int a2 = input();
		
		int result = add(a1, a2);
		show(result);
	}
	
	static void print() {
		System.out.println("두 수를 입력하세요");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int a = scan.nextInt();
		
		return a;
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	static void show(int result) {
		System.out.println("두 수의 합:" + result);
	}
	
	
	
	
	
	
	
	
}
