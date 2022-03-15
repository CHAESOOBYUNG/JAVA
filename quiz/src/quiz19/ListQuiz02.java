package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class ListQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. User 클래스에 생성자, getter, setter 생성
		 * 
		 * 2. User를 제네릭으로 갖는 List를 생성
		 * 
		 * 3. User를 3개 만들어서 리스트에 추가
		 * 4. list에 저장된 모든 이름, 나이를 for문(향상된 for문)으로 출력
		 * 5. list에 홍길동이 있다면, 홍길동의 이름과 나이 출력.
		 * 6. list에 홍길동이 있다면, 홍길동 객체를 삭제.
		 */
		
		List <User> list = new ArrayList <>();
		
		User u1 = new User("홍길동", 20);
		User u2 = new User("일론머스크", 50);
		User u3 = new User("제프베조스", 57);	
		list.add(u1); 
		list.add(u2); 
		list.add(u3); 
		
		for(int i = 0; i < list.size(); i++) {
			User u = list.get(i);
			System.out.println(u.getName() + "-" + u.getAge());
		}
		
		System.out.println("---------------------------------");
		
		for(User u : list) {
			
			if(u.getName().equals("홍길동") ) {
				System.out.println(u.getName() + "-" + u.getAge());
			}
			
		}
		
		System.out.println("--------------------------------");
		//삭제는 일반for문
        		
		for(int i = 0; i < list.size(); i++) {
			//list에서 i인덱스 -> 이름 꺼냄 -> 홍길동 비교
			if(list.get(i).getName().equals("홍길동")) {
				list.remove(i);
				break;
			}
		}
		
		System.out.println(list.toString());
		
		}
		
		
		
		
		
		
		
		
		
		
		}

