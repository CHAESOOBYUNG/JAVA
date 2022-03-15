package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//HashMap<Integer, String> map = new HashMap<>(); //키:숫자, 값:스트링
		Map<Integer, String> map = new HashMap<>();
		
		//값 추가 put(키, 값)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "일론머스크");
		map.put(4,  "신사임당");
		
		System.out.println("맵의 크기:" + map.size());
		System.out.println(map.toString());
		
		//값 수정 - map에 같은 key를 저장하면, key에 대한 value를 수정합니다.
		map.put(4, "감자");
		System.out.println(map.toString());
		
		//값 얻기 get(키) 
		String name = map.get(4);
		System.out.println("4번에 대한 값:" + name);
		
		//맵에 저장된 값을 순서대로 확인하려면 keySet(), EntrySet()을 사용합니다.
		
		Set<Integer> keyset = map.keySet(); //key를 뽑아서 set으로 반환
		System.out.println(keyset.toString());
		
		//향상된 for문
//		for(Integer i : keyset) {
//			System.out.println("키:"+i);
//			System.out.println("값:"+map.get(i));
//		}
		
		//반복자
		Iterator<Integer> iter = keyset.iterator();
		while(iter.hasNext()) {
			int i = iter.next();
			System.out.println("키:" + i);
			System.out.println("값:" + map.get(i));
		}
		
		System.out.println("-------------------------------------");
		//entrySet을 이용해서 Entry를 뽑기
		
		Set<Entry<Integer, String>> entrys = map.entrySet();
		
		for( Entry<Integer, String> e : entrys) { //entry안에 키, 값을 얻는 메서드
			System.out.println("키:" + e.getKey());
			System.out.println("값:" + e.getValue());
		}
		
		System.out.println("-------------------------------------");
		
		//키의 여부 containsKey()
		if(map.containsKey(1)) { //1이 포함되어 있다면 true
			System.out.println("1 키가 포함되어 있음");
		}
		
		//map의 값 삭제 remove(키)
		map.remove(1);
		System.out.println(map.toString());
		
		
	}
}
