package sec05.exam03_comparable;

import java.util.*;

public class ComparableExample {
	//사용자 정의 객체 정렬 방법 1(Comparable)
	public static void main(String[] args) { 
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//저장될 때 나이 순으로 정렬됨
		treeSet.add(new Person("오타니", 28));
		treeSet.add(new Person("채수병", 23));
		treeSet.add(new Person("트라웃", 31));
		
		Iterator<Person> iterator = treeSet.iterator(); //반복자
		//오름차순 (왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져오기)
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
