package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//ArrayList - 배열 기반으로 만들어진 클래스
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//list에 값 추가 add()
		list.add("java");
		list.add("database");
		list.add("js");
		list.add("spring");
		list.add("java"); 
		
		//list의 크기 size()
		System.out.println("리스트 크기:" + list.size());
		
		//list에 저장된 형태를 문자열로 확인 toString()
		System.out.println( list.toString() );
		
		//list 중간에 추가 add(index, 값)
		list.add(2, "react");
		System.out.println( list.toString() );
		
		//list의 값 수정 set(index, 값)
		list.set(2, "vue");
		System.out.println( list.toString() );
		
		//list의 값 확인 get(index)
		String value = list.get(2); //String value = arr[2]
		System.out.println("2번째 인덱스의 값: " + value);
		
		//list의 존재여부 확인 contains(값)
		
		if(list.contains("js")) {//있으면 true, 없다면 false
			System.out.println("js가 존재함");
  		}
		
		//list의 값 삭제 remove(index), remove(값)
		list.remove(1);
		System.out.println(list.toString());
		
		list.remove("java");
		System.out.println(list.toString());
		
		System.out.println("------------------------------");
		
		//리스트 전체 추가하기
		List<String> list2 = new ArrayList<>(); //2번째 리스트
		list2.add("홍길동");
		list2.add("이순신");
		
		list2.addAll(list); //list2에 list요소 전체추구
		
		System.out.println(list2.toString());
		
		System.out.println("--------------------------------");
		
		//배열을 리스트로 변경하기
		String[] arr = {"감자", "고구마"};
		
		List<String> list3 = Arrays.asList(arr);
		
		list2.addAll(list3); //list2에 list3 전체 추가
		
		System.out.println(list2.toString());
		
		
		System.out.println("---------------------------------");
		list2.removeAll(list3);//감자, 고구마 -> 삭제
		System.out.println(list2.toString());
		
		
		
		
		
		
		
	}
}
