package quiz02;

public class Student {
	/* 멤버변수
	 * name - 학생이름
	 * no - 학번
	 * kor - 국어점수
	 * eng - 영어점수
	 * math - 수학점수
	 * 
	 * 생성자
	 * 모든 멤버변수를 받아서 초기화 하도록 선언.
	 * 
	 * 메서드
	 * getTotal() - 국,영,수 점수를 더해서 합계를 반환
	 * getAvg() - getTotal()을 나눈 평균을 double형으로 반환
	 * 
	 * main에서 2명의 학생을 생성하고 확인.
	 */
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String pName, int pNo, int k, int e, int m) {
		name =pName;
		no = pNo;
		kor = k;
		eng = e;
		math = m;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAvg() {
		return (int)(getTotal() / 3.0 * 100) / 100.0;
	}
	
	
	
	


}
