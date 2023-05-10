package sec123_java_class;

class ClassA2 {
	ClassA2() {
		System.out.print('A');
		this.prn();
	}
	
	void prn() {
		System.out.print('B');
	}
}

class ClassB extends ClassA2 {
	ClassB() {
		super();
		System.out.print('D');
	}
	
	void prn() {
		System.out.print('E');
	}
	
	void prn(int x) {
		System.out.print(x);
	}
}

public class No3_Java_question02 {
	public static void main(String[] args) {
		int x = 7;
		ClassB cal = new ClassB();
		cal.prn(x);
	}
}

