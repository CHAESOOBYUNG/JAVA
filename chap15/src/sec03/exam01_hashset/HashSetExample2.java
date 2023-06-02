package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); //동일한 객체는 저장 불가
		
		System.out.println("총 객체수: " + set.size());
	}
}
