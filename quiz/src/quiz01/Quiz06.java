package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		//양, 음수인 경우판별
		if(num >= 0) {
			
			if(num == 0) {
				System.out.println("0입니다");
			} else if(num % 2 == 0) {
				System.out.println(num + "은 짝수 입니다");
			} else {
				System.out.println(num + "은 홀수 입니다");
			}
			
		} else { //음수
			System.out.println(num + "은 음수 입니다");
		}
		
		
		
	}
}
