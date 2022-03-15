package super_.basic;

public class Teacher extends Person {

	String subject;
	
	//this키워드를 이용해서 name, age ,subject를 초기화하는 생성자
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
	
}
