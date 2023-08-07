package sec05.exam04_function;

import java.util.*;
import java.util.function.*;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("채수병", 95, 93)
	);
	
	public static double avg(ToIntFunction<Student> function) { //매개값 -> 리턴값 타입변환
		int sum = 0;
		for(Student student : list) { //list에 저장된 항목 수만큼 루핑
			sum += function.applyAsInt(student); //람다식 실행
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( t -> t.getEnglishScore()); //ToIntFunction<Student> 인스턴스 대입
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( t -> t.getMathScore()); //ToIntFunction<Student> 인스턴스 대입
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}	
