package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//switch문과, while문을 이용해서 작성.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입하세요>");
		int money = scan.nextInt();
		
		
		es:while(true) {
			System.out.println("남은금액:" + money + "원");
			System.out.println("[1]데미소다 400원, [2]밀키스, [3]코카콜라, [4]잔돈받기");
			
			System.out.print("메뉴선택>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				//조건
				if(money >= 400) {
					System.out.println("데미소다를 받...");
					money -= 400;
				} else {
					System.out.println("금액이 부족합니다.");
				}
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("남은금액:" + money +"반환");
				break es;
				
			default:
				break;
			}
			
			
			
		}
		
		
		
		
	}
}
