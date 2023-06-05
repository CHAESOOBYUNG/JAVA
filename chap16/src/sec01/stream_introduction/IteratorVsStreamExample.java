package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("채수병", "오타니", "트라웃");
		
		//Iterator 이용 (java7 이전) 
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		} 
		
		System.out.println();
		
		//Stream 이용 (java8 이후)
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name) );
	}
}
