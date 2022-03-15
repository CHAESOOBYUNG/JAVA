package quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		//정수를 입력 받아서, 양수인지 음수인지 판별하는 프로그램 코드를 작성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력>");
		int num = scan.nextInt();
		
		System.out.println( num > 0 ? "양수입니다" : "음수입니다");
		
		
		scan.close();
		
		
	}
}
