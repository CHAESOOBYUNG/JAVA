package day03;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		//개수를 이용해서, 소수판별(소수는 나머지 개수가 항상2개)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		int count = 0; //숫자를 셀 카운트변수
		//i = 1, 2, 3......num
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) { //num의 약수
				count++;
			}
		}
		
		System.out.println(count == 2 ? num +"은 소수" : num + "은 소수가 아닙니다");
		
		
		
		
		
		
	}
}
