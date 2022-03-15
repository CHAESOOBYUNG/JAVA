package quiz19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz01 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("kim123", "kkk1234");
		map.put("lee5678", "lll5678");
		map.put("park123", "ppp123"); //키는 아이디, 값은 비밀번호

		/*
		 * <로그인 입력값 검증>

		 * 1. 입력받은 아이디가 맵에 입력된 키값에 
		 *    해당하는지의 여부를 검사하여(containsKey 메서드 활용)
		 * 2. 맞다면 다시한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		 *    "로그인 성공"을 콘솔에 출력하고 반복문을 탈출하세요.
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력하세요.
		 * 4. 입력받은 아이디가 맵에 입력된 키값이 아니라면 
		 *    "아이디가 존재하지 않습니다"를 출력하세요.
		 */
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("아이디>");
			String id = scan.next(); //id가 key
			if(map.containsKey(id)) {
				System.out.println("비밀번호>");
				String pw = scan.next();
				//map에서 id키를 꺼내서 pw와 equals 비교
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break; //그만
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			} else {
				System.out.println(id + "가 없습니다");
			}
		}
		//		while(true) {
		//			System.out.println("아이디>");
		//			String a = scan.nextLine();
		//			if(map.containsKey(a)) {
		//				System.out.println("비밀번호>");
		//				String b = scan.nextLine();
		//				if(map.containsValue(b)) {
		//					System.out.println("로그인 성공");
		//					break;
		//				} else {
		//		 		 System.out.println("비밀번로가 틀렸습니다");
		//				}
		//			} else {
		//				System.out.println("아이디가 존재하지 않습니다");
		//			}
		//		} 
	}
}



