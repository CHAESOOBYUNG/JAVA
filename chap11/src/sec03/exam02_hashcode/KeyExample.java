package sec03.exam02_hashcode;

import java.util.*;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동"); // hashCode() 메소드 실행
		
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
