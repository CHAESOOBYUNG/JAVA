package sec03.exam02_hashcode;

import java.util.*;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동"); // hashCode() 메소드 실행
		
		//식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1)); // hashCode() 메소드 실행 -> equals() 메소드 실행
		System.out.println(value);
		
		/* hashcode() 메소드를 재정의 하지 않았을 때 결과값
		 * null
		 * 
		 * hashcode() 메소드를 재정의 했을 때 결과값
		 * hashCode()
		 * hashCode()
		 * equals()
		 * 홍길동
		 */
	}
}
