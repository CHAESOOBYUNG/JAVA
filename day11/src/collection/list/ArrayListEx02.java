package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {

	public static void main(String[] args) {
		
		//제네릭 표현문법
		/*
		 * List<?> - 무엇이든 다 들어갈 수 있음
		 * List<? extends String> - String을 상속받는 자식클래스는 전달가능.
		 * List<? super Integer> - Integer의 형태를 가진다면 전달가능.
		 */
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 =new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		addAll(list1);
		addAll(list2);
		addAll(list3);
		
		addAll2(list1); //String o
//		addAll2(list2); //Integer x
//		addAll2(list3); //Object x
		
//		addAll3(list1); //String x
		addAll3(list2); //Integer o
		addAll3(list3); //Object o
	}
	
	public static void addAll(List<?> list) {
		
	}
	
	public static void addAll2(List<? extends String> list) {
		
	}
	
	public static void addAll3(List<? super Integer> list) {
		
	}
	
}
