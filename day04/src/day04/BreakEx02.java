package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		//정답맞추기 -> 오답인경우 횟수 체크 
		Scanner scan = new Scanner(System.in);
		
		int count = 0; //오답카운트
		
		while(true) {
			System.out.println("4 x 6 = ?");
			System.out.print("정답>");
			int answer = scan.nextInt();
			
			if(answer == 24) {
				System.out.println("정답입니다!");
				break;
			}
			
			System.out.println("틀렸는데요?ㅋㅋ");
			count++;
			
		}

		System.out.println("오답횟수:" + count);
		
		
		
		
		
		
		
		
	}
}
