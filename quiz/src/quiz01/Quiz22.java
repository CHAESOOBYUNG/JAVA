package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0;
		int noCount = 0;
		
		while(true) {
			
			int n1 = (int)(Math.random() * 100) + 1;
			int n2 = (int)(Math.random() * 100) + 1;
			
			int x = (int)(Math.random() * 2 ); //0 or 1
			if(x == 0) {
				System.out.println(n1 + " + " + n2 + " = ?");
			} else {
				System.out.println(n1 + " - " + n2 + " = ?");
			}
			
			System.out.println("[0을 입력하면 프로그램을 종료합니다]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			int correct = x == 0 ? n1+n2 : n1-n2; //정답
			if(answer == 0) {
				System.out.println("[프로그램을 종료합니다]");
				break; //0을 받으면 탈출
			}
						
			if(correct == answer) { //정답인경우
				System.out.println("정답입니다");
				okCount++;
			} else if(correct != answer) { //오답
				System.out.println("틀렸는데요?");
				noCount++;
			}
			
		}
		
		System.out.println("정답카운트:" + okCount);
		System.out.println("오답카운트:" + noCount);
		
		
		
		
	}
}
