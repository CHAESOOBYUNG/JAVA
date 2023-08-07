package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //동일한 객체는 중복 저장 x ("Java"는 한 번만 저장됨)
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size); //저장된 객체 수 얻기
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { //객체의 수만큼 루핑
			String element = iterator.next(); //1개 객체 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC"); //1개 객체 삭제
		set.remove("iBATIS"); //1개 객체 삭제
		
		System.out.println("총 객체수: " + set.size()); //저장된 객체 수 얻기
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); //모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
