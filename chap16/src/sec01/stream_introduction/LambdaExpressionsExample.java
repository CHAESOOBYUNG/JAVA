package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("오타니", 90),
			new Student("채수병", 92)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
