package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수1>");
		int n1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String s = scan.next();
		
		System.out.print("정수2>");
		int n2 = scan.nextInt();
		
		switch (s) {
		case "+":
			System.out.println("두 수의 합:" + (n1 + n2) );
			break;
		case "-":
			System.out.println("두 수의 차:" + (n1 - n2) );
			break;
		case "*":
			System.out.println("두 수의 곱:" + (n1 * n2) );
			break;
		case "/":
			System.out.println("두 수의 나누기:" + (n1 / n2 ));
			break;
			
		default:
			System.out.println("연산자를 [+,-,*,/]를 입력하세요");
			break;
		}
		
		
		
		
		
		
		
		
	}
}
