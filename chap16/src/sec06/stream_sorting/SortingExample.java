package sec06.stream_sorting;

import java.util.*;
import java.util.stream.*;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted() //숫자를 오름차순으로 정렬
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		List<Student> studentList = Arrays.asList(
			new Student("채수병", 30),
			new Student("오타니", 10),
			new Student("트라웃", 20)
		);
		
		studentList.stream()
			.sorted() //정수 기준 오름차순 Student 정렬
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		studentList.stream()
			.sorted(Comparator.reverseOrder()) //정수 기준 내림차순 Student 정렬
			.forEach(s -> System.out.print(s.getScore() + ","));
	}
}
