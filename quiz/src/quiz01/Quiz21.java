package quiz01;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		/* ----------과제
		 * up-down게임
		 * 
		 * 1~100까지 (한번) 임의 숫자를 생성.
		 * 정답을 맞출때 까지 스캐너를 통해서 입력을 받습니다.
		 * 
		 * 랜덤수가 정답보다 작으면 "더 큰 수를 입력하세요"
		 * 랜덤수가 정답보만 크면 "더 작은수를 입력하세요"
		 * 정답이면, 시도횟수를 체크하고 종료합니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int r = (int)(Math.random() * 100) + 1;
		int count = 0; //시도횟수
		
		while(true) {
		
			System.out.println("1~100까지 정수중 값을 입력하세요");
			System.out.print(">");
			
			int answer = scan.nextInt();
			count++; //시도횟수 증가
			
			if(r == answer) {
				//정답
				System.out.println("정답입니다");
				System.out.println("시도횟수:" + count);
				break;
			} else if(r > answer) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("더 작은 수를 입력하세요");
			}
			
		} //end while
		
		
		
		
		
		
		
		
		
	}
}
