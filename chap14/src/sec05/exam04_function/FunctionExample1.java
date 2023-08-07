package sec05.exam04_function;

import java.util.*;
import java.util.function.*;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("채수병", 95, 93)
	);
	
	public static void printString(Function<Student, String> function) { //매개값 -> 리턴값 타입변환
		for(Student student : list) { //list에 저장된 항목 수만큼 루핑
			System.out.print(function.apply(student) + " "); //람다식 실행
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) { //list에 저장된 항목 수만큼 루핑
			System.out.print(function.applyAsInt(student) + " "); //람다식 실행
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName() ); //Function<Student, String> 인스턴스 대입
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() ); //ToIntFunction<Student> 인스턴스 대입
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() ); //ToIntFunction<Student> function 인스턴스 대입
	}
}	
