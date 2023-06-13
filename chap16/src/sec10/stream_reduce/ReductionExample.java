package sec10.stream_reduce;

import java.util.*;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("채수병", 92),
			new Student("오타니", 95),
			new Student("트라웃", 88)
		);
		
		//sum() 이용
		int sum1 = studentList.stream()
			.mapToInt(Student :: getScore)
			.sum();
		
		//reduce(BinaryOperator<Integer> ac) 이용
		int sum2 = studentList.stream()
			.mapToInt(Student :: getScore)
			.reduce((a, b) -> a+b)
			.getAsInt();
		
		//reduce(int identity, IntBinaryOperator op) 이용
		int sum3 = studentList.stream()
			.mapToInt(Student :: getScore)
			.reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}
