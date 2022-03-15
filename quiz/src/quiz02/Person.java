package quiz02;

public class Person {

	String name;
	int age;
	int tall;
	
	//생성자(직접 생성자를 만들게 되면 기본생성자를 자동생성하지 않습니다)
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	Person() {
		
	}
	
	void info() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("신장:" + tall);
	}
	
}
