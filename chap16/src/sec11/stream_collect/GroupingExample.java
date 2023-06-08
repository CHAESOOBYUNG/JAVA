package sec11.stream_collect;

import java.util.*;
import java.util.stream.*;

public class GroupingExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("채수병", 25, Student.Sex.MALE, Student.City.NEWYORK),
			new Student("리즈", 18, Student.Sex.FEMALE, Student.City.NEWYORK),
			new Student("오타니", 28, Student.Sex.MALE, Student.City.LA),
			new Student("안유진", 19, Student.Sex.FEMALE, Student.City.LA)
		);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
			.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.print("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream()
			.forEach(s -> System.out.print(s.getName() + " "));

		System.out.print("\n[여학생] ");
		mapBySex.get(Student.Sex.FEMALE).stream()
			.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student :: getCity,
					Collectors.mapping(Student::getName, Collectors.toList())
				)
			);
		
		System.out.print("\n[뉴욕] ");
		mapByCity.get(Student.City.NEWYORK).stream()
			.forEach(s -> System.out.print(s + " "));
		
		System.out.print("\n[LA] ");
		mapByCity.get(Student.City.LA).stream()
			.forEach(s -> System.out.print(s + " "));
	}
}
