package quiz02;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 1, 100, 23, 34);
		
		Student s2 = new Student("이순신", 2, 90, 30, 53);
		
		System.out.println(s1.getAvg());
		System.out.println(s2.getAvg());
		
		
	}
}
