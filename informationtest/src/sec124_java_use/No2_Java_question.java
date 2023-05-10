package sec124_java_use;

abstract class Animal {
	String a = "is animal";
	abstract void look();
	void show() {
		System.out.println("Zoo");
	}
}

class Chicken extends Animal {
	Chicken() {
		look();
	}
	
	void look() {
		System.out.println("Chicken" + a);
	}
	
	void display() {
		System.out.println("two wings");
	}
}

public class No2_Java_question {
	public static void main(String[] args) {
		Animal a = new Chicken();
		a.show();
	}
}
