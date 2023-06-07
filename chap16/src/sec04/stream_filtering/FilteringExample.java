package sec04.stream_filtering;

import java.util.*;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("장원영", "김지원", "김가을", "김지원", "이현서");
		
		names.stream()
			.distinct() //중복 제거
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("김")) //필터링
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("김")) //중복 제거 후 필터링
			.forEach(n -> System.out.println(n));
	}
}
