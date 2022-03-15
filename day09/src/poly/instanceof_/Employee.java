package poly.instanceof_;

public class Employee extends Person {

	String department;

	//this키워드를 이용해서 name, age, department를 초기화하는 생성자
	Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}


}
