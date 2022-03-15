package quiz15;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 무한 반복문 안에서 인터페이스를 구현하는 클래스를 실행.
		 */
		Scanner scan = new Scanner(System.in);
		
		SongList melon = new BugsMusic(); //new MelonMusic();
		
		
		while(true) {
			
			System.out.println("메뉴: 1.추가하기, 2.재생하기, 3.목록개수, 4.종료하기" );
			System.out.print(">");
			String menu = scan.next();
			
			if(menu.equals("1") ) {
				System.out.print("음악>");
				String song = scan.next();
				melon.insertList(song);
				
			} else if(menu.equals("2")) {
				//재생하기
				melon.playList();
			} else if(menu.equals("3")) {
				//목록개수
				int count = melon.playLength();
				System.out.println("음악개수:" + count);
				
			} else if(menu.equals("4")) {
				System.out.println("종료");
				break;
			}
				
		}
		
		
		
		
		
	}
}
