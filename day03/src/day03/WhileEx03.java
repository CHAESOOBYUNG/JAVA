package day03;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//조건을 달리해서 수를 판별(입력받은 값이 소수)
		//소수 - 나누어 떨어지는수가 1and자신 인 수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("판별할 수 입력>");
		int num = scan.nextInt();
		
		int a = 2;
		while(num % a != 0) {
			
			a++;
		}
		
		//a가 num까지 증가했다면, 소수
		if(a == num) {
			System.out.println(num + "은 소수 입니다");
		} else {
			System.out.println(num + "은 소수가 아닙니다");
		}
		
		
		
		
		
		
	}
}
