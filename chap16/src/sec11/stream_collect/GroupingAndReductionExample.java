package sec11.stream_collect;

import java.util.*;
import java.util.stream.*;

public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("채수병", 10, Student.Sex.MALE, Student.City.NEWYORK),
			new Student("리즈", 12, Student.Sex.FEMALE, Student.City.NEWYORK),
			new Student("오타니", 10, Student.Sex.MALE, Student.City.LA),
			new Student("안유진", 12, Student.Sex.FEMALE, Student.City.LA)
		);
		
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student :: getSex,
					Collectors.averagingDouble(Student :: getScore)
				)
			);
		
		System.out.println("남학생의 평균 점수: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생의 평균 점수: " + mapBySex.get(Student.Sex.FEMALE));
		
		//성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<Student.Sex, String> mapByName = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student :: getSex,
					Collectors.mapping(
						Student :: getName,
						Collectors.joining(",")
					)
				)
			);
		
		System.out.println("남학생 전체 이름: " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(Student.Sex.FEMALE));
	}
}
