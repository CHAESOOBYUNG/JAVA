package sec05.stream_mapping;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("채수병", 10),
			new Student("오타니", 20),
			new Student("트라웃", 30)
		);
				
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}
}
