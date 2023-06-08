package sec12.stream_parallelism;

import java.util.*;

import sec11.stream_collect.MaleStudent;
import sec11.stream_collect.Student;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("채수병", 10, Student.Sex.MALE),
			new Student("리즈", 10, Student.Sex.FEMALE),
			new Student("오타니", 10, Student.Sex.MALE),
			new Student("안유진", 10, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(
						() -> new MaleStudent(),
						(r, t) -> r.accumulate(t),//accumulate() 두번 호출 -> 요소들 2번 수집
						(r1, r2) -> r1.combine(r2)); //멀티스레드에서 combiner 사용
						//(supplier, accumulator, combiner) 
		/* MaleStudent maleStudent = totalList.parallelStream()
		 	.filter(s -> s.getSex() == Student.Sex.MALE)
		 	.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine); */
		 
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	} //CPU 듀얼 코어 결과값 출력됨 // 쿼드코어에선 chap16.sec11.stream_collect 외부결과와 같음
}
