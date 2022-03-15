package quiz19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용한 간단한 프로그램 key: 메뉴이름, value: 가격
		Map< String, Integer> map = new HashMap<>();

		while(true) {
			System.out.println("------음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록");
			System.out.println("2. 메뉴 전체 확인");
			System.out.println("3. 메뉴 수정");
			System.out.println("4. 메뉴 삭제");
			System.out.println("5. 종료");

			System.out.println("메뉴입력>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
                //새로운 메뉴와 가격을 받아서 맵에 추가(기존메뉴가 있는지 확인)
				System.out.println("메뉴 이름>");
				String name = scan.next();
				
				if(map.containsKey(name)) { //메뉴가 포함됨
					System.out.println("기존 메뉴가 존재합니다");
				} else {
					System.out.println("가격:");
					int price = scan.nextInt();
					map.put(name, price);
					System.out.println("정상 입력되었습니다");
				}
				
				
				break;
			case 2:
                //전체 메뉴를 출력
				Set<Entry<String, Integer>> iter = map.entrySet();
				
				for(Entry<String, Integer> e : iter) {
					System.out.println("메뉴:" + e.getKey() + ", 가격:" + e.getValue());
				}
				
				
				break;
			case 3:
                //가격을 변경할 메뉴를 입력받아서, 메뉴가 존재하면 새로 입력받은 가격으로 수정
				System.out.println("변경할 메뉴>");
				String m2 = scan.next();
				if(map.containsKey(m2)) {
					
					System.out.println("수정할 가격>");
					int price2 = scan.nextInt();
					map.put(m2, price2);
				} else {
					System.out.println("메뉴가 없습니다");
				}
				break;
			case 4:
                //메뉴를 받아서, 삭제
				System.out.println("삭제할 메뉴>");
				String m3 = scan.next();
				
				if(map.containsKey(m3)) {
				map.remove(m3);
				} else {
				System.out.println(map.toString());
				}
				
				
				break;
			case 5:
                //탈출
				System.exit(0); //프로그램 종료

			default:
				//잘못입력한 경우
				System.out.println("올바른 메뉴를 입력하세요");
				break;
			}



		}





	}
}
