package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //합계변수
		int a = 1;
		while(a != 0) {
			
			System.out.print("정수입력>");
			a = scan.nextInt();
			sum += a;			
		}
		
		System.out.println("입력받은 수의 합계:" +  sum);
		
		
		
		
	}
}
