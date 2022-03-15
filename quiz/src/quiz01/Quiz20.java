package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();
		
		//입력받은 수가 소수인지 판별?
//		int count = 0;
//		for(int i = 1; i <= num; i++) {
//			//소수판별
//			if(num % i == 0) {
//				count++;
//			}
//		}
		int sum = 0; //합계변수
		int count = 0; //카운트변수
		
		for(int i = 1; i <= num; i++) { 

			//i값이 소수인지 아닌지 판별.
			count = 0; //초기화
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) { //i의 약수
					count++;
				}
				
			} //end inner
			if(count == 2) sum += i; //코드가 1줄인 경우 중괄호 생략가능
			
		} //end outer
		
		System.out.println(num + "까지 소수의합:" + sum);
		
		
		
		
		
		
		
		
	}
}
