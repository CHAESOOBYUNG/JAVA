package poly.instanceof_;

public class Person /*extends Object */{

	String name;
	int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}
	
	Person(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1);
		
	}
	
	Person() {
		this("이름미정", 1);
	}
	
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
