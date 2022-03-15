package day04;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();

		int sum = 0; //합계변수
		int count = 0; //카운트변수
		
		start:for(int i = 1; i <= num; i++) { 

			//i값이 소수인지 아닌지 판별.
			count = 0; //초기화
			for(int j = 1; j <= i; j++) {
								
				if(i % j == 0) { //i의 약수
					count++;
				}
				
				if(count >= 3) continue start; //바깥반복문의 다음으로 이동.
				
			} //end inner
			if(count == 2) sum += i; //코드가 1줄인 경우 중괄호 생략가능
			
		} //end outer
		
		System.out.println(num + "까지 소수의합:" + sum);
		
		
		
		
	}
}
