package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {

		//		int a = 1;
		//		while(a <= 10) {
		//			
		//			System.out.println(a + "번 학생 출석체크합니다");
		//			a++;
		//		}


		//구구단 형식출력 (단수 x 행수 = 단수*행수)

		Scanner scan = new Scanner(System.in);

		System.out.print("구구단 단수를 입력하세요:");
		int dan = scan.nextInt();

		System.out.println("랜덤구구단:" + dan + "단");
		System.out.println("----------------------");

		int i = 1;
		while(i <= 9) {

			//System.out.println(dan + " x " + i + " = " + dan*i);
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			
			i++;
		}
		
		
	}
}
