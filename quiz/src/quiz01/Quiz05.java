package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
//		1. 정수 2개를 입력 받으세요.
//		2. 두 수를 비교해서 “x 가 큰 수 입니다“ 를 출력 
//		, 같은 수라면 “같은 수 입니다“ 를 출력하세요. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int num1 = scan.nextInt();
		
		System.out.print(">");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("같은 수 입니다");
		} else if(num1 > num2) {
			System.out.println(num1 + "이 큰 수 입니다" );
		} else if(num2 > num1) {
			System.out.println(num2 + "이 큰 수 입니다");
		}
		
		
		
		
		
		
	}
}
