package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random ran = new Random();
		
		for(int i = 0; i < 100; i++) {
			list.add( ran.nextInt(100) + 1 );
		}
		
		
		
		System.out.println(list.toString());
		
		System.out.println("--------------------------------------------");
		/*
		 * 함수적 인터페이스의 형태
		 * Consumer - 매개변수는 o, 반환은 void인 형태
		 * Predicate - 매개변수는 o, 반환은 boolean인 형태
		 * Function - 매개변수는 o, 반환은 결정해주는 형태
		 */
		//스트림의 distinct
		long cnt = list.stream().distinct().count();
		System.out.println("스트림크기:" + cnt);
		
		//스트림의 결과반복
		list.stream().distinct().forEach( (a) -> System.out.print(a + " ") );
		
		System.out.println();///////////////////////////////////////////////////////
		//스트림의 정렬 sorted()
		list.stream().distinct().sorted().forEach( (x) -> System.out.print(x + " ") );
		
		System.out.println();///////////////////////////////////////////////////////
		//스트림의 걸러내는 기능 filter() - return에 true인 값만 반환
		list.stream().distinct().sorted().filter( (x) -> {
			return x % 2 == 0;
		}).forEach( (x) -> System.out.print(x + " ") );		
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("list의형태:" + list.toString());
	
//		list.stream().map(new Function<Integer, String>() {
//			@Override
//			public String apply(Integer t) {
//				return t % 2 == 0 ? "짝" : "홀";
//			}
//		});
		
		//스트림을 새로운 스트림의 형태로 반환 map()
		list.stream().map( (t) -> {
			return t % 2 == 0 ? "짝" : "홀";
		}).forEach( (a) -> System.out.print(a + " ") );
		
		System.out.println("\n---------------------------------------------");
		
		//mapToint() 정수형 스트림
		//정수형 스트림은 집계함수의 사용이 가능.
		int sum = list.stream().mapToInt( (t) -> t ).sum();
		System.out.println("리스트 요소의 합:" + sum);
		long cnt2 = list.stream().mapToInt((t) -> t ).count();
		System.out.println("리스트 요소의 개수:" + cnt2 );
		double avg = list.stream().mapToInt((t) -> t).average().getAsDouble();
		System.out.println("리스트 요소의 평균:" + avg);
		int max = list.stream().mapToInt((t) -> t).max().getAsInt();
		System.out.println("리스트 요소의 max값:" + max);
		
		System.out.println("\n--------------------------------------------");
		//최종함수 collect()
		
		List<Integer> newList = list.stream().filter( (t) -> t % 3 == 0).collect( Collectors.toList() );
		
		System.out.println(newList.toString());
		
		System.out.println("\n--------------------------------------------");
		//실습
		//list의 5의 배수만 중복o 정렬해서 해당 리스트를 새로운 리스트로 반환.
		List<Integer> list2 = list.stream().filter( (a) -> a % 5 == 0).sorted().collect( Collectors.toList() );
		System.out.println(list2.toString());
		
		//list의 5의 배수만 중복x 추출해서 평균.
		double list2Avg = list.stream()
				              .distinct()
				              .filter( (a) -> a % 5 == 0)
				              .mapToInt( (t) -> t )
				              .average()
				              .getAsDouble();
		
		System.out.println("평균값:" + list2Avg);
		
		
		
		
		
		
		
		
		
		
		
	}
}
