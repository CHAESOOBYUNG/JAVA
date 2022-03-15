package ramda.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		String[] arr = {"홍길동", "홍길자", "이순신", "감자", "고구마"};
		List<String> list = Arrays.asList(arr);
		
		Iterator<String> iter = list.iterator(); //반복자
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("---------------------------------------");
		
		//컬렉션의 스트림을 이용하는 방법
		Stream<String> stream = list.stream();
		
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//			
//		});
		
		
		//forEach()는 매개변수로 익명객체를 받기때문에, 람다식으로 대체가 가능.
		//실행문이 1줄이면 {}생략가능.
		stream.forEach( (t) -> System.out.println(t) );
		
		
		
		
		
		
		
		
		
		
	}
}
