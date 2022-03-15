package quiz20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		 * 1. List, set, map을 이용해서 (택 1)
		 * 간단한 프로그램코드를 작성합니다.
		 * ex) 도서관리, 인사관리, 예약시스템, 물품관리
		 * 
		 * 2. ex) 도서관리
		 * 도서 정보를 저장하는 getter, setter를 가진 클래스를 생성
		 * 
		 * 3. 기능은 3개 이상. (만들고, 합쳐)
		 * 
		 * 
		 * 
		 */
		Map<String, Integer> map = new HashMap<>(); //컵 사이즈, 가격
		System.out.println("베스킨라빈스 주문하기");
		System.out.println("메뉴를 입력");
		Scanner scan = new Scanner(System.in);
		
		map.put("파인트", 8200);
		map.put("쿼터", 15500);
		map.put("페밀리", 22000);
		map.put("하프갤런", 26500);
		
		
		System.out.print("컵사이즈>");
		String cupsize = scan.next();
		if(map.containsKey(cupsize)) {
			System.out.println(map.get(cupsize));
		} else {
			System.out.println("파인트, 쿼터, 페밀리, 하프갤런 중 하나를 입력해주세요");
		}
		
		System.out.println("맛을 입력해주세요>");
		System.out.println("파인트 3개, 쿼터 4개, 페밀리 5개, 하프갤런 6개");
		
	}
}
