package sec07.stream_looping;

import java.util.*;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter( a -> a%2 == 0)
			.peek( n -> System.out.println(n) ); //동작하지 않음 (최종처리 메소드 실행 X)
		
		System.out.println();
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
				.filter( a -> a%2 == 0)
				.peek( n -> System.out.println(n)) //동작함
				.sum(); //최종 메소드
		System.out.println("총합: " + total);
		
		System.out.println();
		
		System.out.println("[forEach를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter( a -> a%2 == 0)
			.forEach( n -> System.out.println(n)); //최종 메소드로 동작함
	}
}
