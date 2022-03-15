package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//List<String> list = new LinkedList<>(); //list처럼 사용.
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("이순신");
		list.add("김길동");
		list.add("신사임당");
		
		//확인
		System.out.println( list.toString() );
		
		//값 얻기 get(index)
		String name = list.get(0);
		System.out.println(name);
		
		//삭제
		list.remove(0);
		System.out.println(list.toString());
		
		System.out.println("----------------------------------");
		
		//linkedList의 기능
		list.addFirst("홍길동");
		list.addLast("일론머스크");
		System.out.println(list.toString());
		
		//queue의 기능도 사용이 가능 - FIFO (First In First Out)
		//offer, poll
		
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());

		String x = list.poll();
		System.out.println(x);
		System.out.println("poll이후의 리스트:" + list.toString());
		
		System.out.println("-----------------------------------");
		
		//linkedList가 가지고 있는 LIFO - (Last in first out)
		//push, pop
		
		list.push("1");
		System.out.println("push이후의 리스트:" + list.toString());
		
		String y = list.pop();
		System.out.println(y);
		System.out.println("pop이후의 리스트" + list.toString());
		
		
		
		
		
	}
}
