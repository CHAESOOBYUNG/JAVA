package overriding.basic02;

public class Teacher extends Person {

	String subject;

	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
	
}
