package day03;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요>");
		int point = scan.nextInt();
		
		
		if(point >= 90) {
						
			if(point >= 95) {
				System.out.println("A+학점 입니다");
				
			} else { //90 <= x < 95
				System.out.println("A학점 입니다");
			}
			
		} else if (point >= 80) {
			System.out.println("B학점 입니다");
		} else if (point >= 70) {
			System.out.println("C학점 입니다");
		} else if (point >= 60) {
			System.out.println("D학점 입니다");
		} else {
			System.out.println("재수강 입니다");			
		}
		
		
		scan.close();
		
		
		
	}
}
