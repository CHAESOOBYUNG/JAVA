package sec01.stream_introduction;

import java.util.*;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("채수병", 10),
				new Student("오타니", 20),
				new Student("트라웃", 30)
		);
		
		double avg = studentList.stream()
			//중간 처리(학생 객체를 점수로 매핑)
			.mapToInt(Student :: getScore) //Student 매개값 -> getScore로 변환
			//최종 처리(평균 점수)
			.average()
			.getAsDouble();
		
		System.out.println("평균 점수: " + avg);
	}
}
