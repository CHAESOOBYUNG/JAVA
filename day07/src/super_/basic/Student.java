package super_.basic;

public class Student extends Person {

	String studentId;
	
	//this키워드 이용해서 name, age, studentId를 초기화하는 생성자
	Student(String name, int age, String studentId) {
//		super(); //생략.
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}

}




