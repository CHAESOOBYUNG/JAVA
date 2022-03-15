package quiz16;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면, 두 수의 합을 출력하고 반복문을 종료.
		 * 3. 입력받은 값이 예외를 발생시키면, "정수로 입력하세요"
		 *    를 출력한 다음에, 다시 처음부터 입력받습니다.
		 * 4. 반복문 종료후에는 프로그램 정상종료 문장을 띄워주세요.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try {

				System.out.print(">");
				int num1 = scan.nextInt();
				
				System.out.print(">");
				int num2 = scan.nextInt();
				
				System.out.println(num1 + num2);
				
				break; //반복문종료
				
			} catch (Exception e) {
				scan.nextLine(); //엔터값의 제거
				System.out.println("숫자로 입력하세요");
			}
			
			
		}
		
		
		
		
		
		
	}
}
