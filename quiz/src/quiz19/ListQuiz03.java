package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	public static void main(String[] args) {

		//list를 이용해서 간단한 프로그램 작성.
		//앞전에 만들었던 User클래스를 사용하면 됩니다.

		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); //저장할 리스트

		while(true) {

			System.out.println("1. 등록 | 2. 회원정보보기 | 3. 회원정보검색 | 4. 회원정보삭제 | 5. 종료");
			System.out.println("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				//스캐너로 이름, 나이를 입력받고, User에 저장, 리스트에 추가.
				System.out.println("이름>");
				String name = scan.next();
				System.out.println("나이>");
				int age = scan.nextInt();

				User user = new User(name, age);
				list.add(user);



			} else if(menu == 2) {
				//list에 있는 회원정보를 전부 출력
				for(int i = 0; i <list.size(); i++) {
					System.out.println("이름: " + list.get(i).getName() );
					System.out.println("나이: " + list.get(i).getAge() );
				}
			} else if(menu == 3) {
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.

				String name = scan.next();

				boolean flag = true; //
				for(User u : list) {

					if(u.getName().equals(name)) { //이름을 찾은 경우
						System.out.println("이름: " + u.getName() + ", 나이" + u.getAge());
						flag = false; //찾음
					}
				}
				
				if(flag) {
					System.out.println(name+"님은 목록에 없습니다");
				}
				
			} else if(menu == 4) {
				//삭제할 이름을 받아서, 입력받은 이름에 해당되는 User객체를 삭제
				String name = scan.next();
				for(int i = 0; i <list.size(); i++) {
					
					if(list.get(i).getName().equals(name) ) {
						list.remove(i); //해당 인덱스 삭제
						System.out.println(name + "님이 삭제되었습니다");
						break;
					}
				}
				
				
				
			} else if(menu == 5) {
				//탈출
				break;
			} else {
				System.out.println("다시 입력해 주세요");//잘못입력한 경우
				break;
			}
		}

	}
}
