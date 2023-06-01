package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		//2번 인덱스 객체 얻기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		//저장된 총 객체 수만큼 루핑
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		//
		list.remove(2); //2번 인덱스 객체(Database) 삭제됨
		list.remove(2); //2번 인덱스 객체(Servlet/JSP) 삭제됨
		list.remove("iBATIS");
		for(int i = 0; i < list.size(); i++) { //저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
	}
}
