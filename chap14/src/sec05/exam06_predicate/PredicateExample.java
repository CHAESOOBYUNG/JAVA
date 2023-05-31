package sec05.exam06_predicate;

import java.util.*;
import java.util.function.*;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("리즈", "여자", 90),
			new Student("채수병", "남자", 95),
			new Student("장원영", "여자", 92)
	);
	
	public static double avg(Predicate<Student> predicate) { //매개값 조사 -> true, false 리턴
		int count = 0, sum = 0;
		for(Student student: list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		//남자 평균 점수
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		//여자 평균 점수
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}
}
