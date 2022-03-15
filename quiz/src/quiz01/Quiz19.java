package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();
		
		//테두리만 출력하도록 조건식을 세웁니다.
		//힌트 - 첫행, 마지막행, 첫열, 마지막열 일 경우만 *를 출력,
		//	    나머지는 공백출력.
		//숙제
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {

				if(i == 1 || i == h) { //첫행, 마지막행
					System.out.print("*");
				} else { 
					if(j == 1 || j == w) { //첫열, 마지막열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
