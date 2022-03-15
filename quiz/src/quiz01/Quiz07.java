package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 받아서, 큰값,중간값,작은값을 구해서, 
		 * 조건문 안에서 max,mid,min값을 저장
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int num1 = scan.nextInt();
		
		System.out.print(">");
		int num2 = scan.nextInt();

		System.out.print(">");
		int num3 = scan.nextInt();
		
		int max = 0; //가장 큰 값을 저장
		int mid = 0; //중간 값을 저장
		int min = 0; //가장 작은 값을 저장
		
		if(num1 > num2 && num1 > num3) {
			
			max = num1; //가장 큰값
			if( num2 > num3) { 
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
			
		} else if(num2 > num1 && num2 > num3) { //num2가 가장 큰 경우
			
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
		} else { //num3이 가장 큰 경우
			
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
			
		}
		
		System.out.println("max:" + max);
		System.out.println("mid:" + mid);
		System.out.println("min:" + min);
		
		
		
		
		
		
		
		
		
		
	}
}
