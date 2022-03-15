package exception.trycatch;

import java.util.Scanner;

public class TrycatchEx03 {

	public static void main(String[] args) {
		
		//Scanner에서 예외처리
		//무조건 숫자를 입력받는 처리 (자바 nextInt() 무한루프)
		Scanner scan = new Scanner(System.in);
		
		//1st
		while(true) {
			
			try {
				System.out.print(">");
				int num = scan.nextInt();
			} catch (Exception e) {
				scan.nextLine(); //
				System.out.println("숫자로 입력하세요!!");
				
			}
		}

		//2nd
//		while(true) {
//			
//			try {
//				
//				System.out.print(">");
//				int num = Integer.parseInt(scan.nextLine()  );
//				
//			} catch (Exception e) {
//				System.out.println("숫자로 입력하세요!!");
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
