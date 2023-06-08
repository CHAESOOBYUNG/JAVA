package sec11.stream_collect;

import java.util.*;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("채수병", 10, Student.Sex.MALE),
			new Student("리즈", 6, Student.Sex.FEMALE),
			new Student("오타니", 10, Student.Sex.MALE),
			new Student("안유진", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
			.filter(s -> s.getSex() == Student.Sex.MALE)
			.collect(
					() -> new MaleStudent(),
					(r, t) -> r.accumulate(t), //accumulate() 두번 호출 -> 요소들 2번 수집
					(r1, r2) -> r1.combine(r2)); //싱글스레드에서 combiner는 사용되지 않음
					//(supplier, accumulator, combiner) 
		
		/* MaleStudent maleStudent = totalList.stream()
		 	.filter(s -> s.getSex() == Student.Sex.MALE)
		 	.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine); */
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
