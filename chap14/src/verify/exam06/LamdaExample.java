package verify.exam06;

import java.util.function.*;

public class LamdaExample {
	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("채수병", 95, 93)
	};
	
	//avg() 메소드 작성
	public static double avg(ToIntFunction<Student> function) { //Student 객체를 int 타입으로 변경
		int sum = 0;
		for(Student student: students) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
		
		/* exam07 람다식 -> 메소드 참조로 변경
		   double englishAvg = avg( s -> s.getEnglishScore() );
		-> double englishAvg = avg(Student :: getEnglishScore() );
		
		   double mathAvg = avg( s -> s.getMathScore() );
		-> double mathAvg = avg(Student :: getMathScore() ); */
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() { return name; }
		public int getEnglishScore() { return englishScore; }
		public int getMathScore() { return mathScore; }
	}	
}
