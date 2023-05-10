package sec124_java_use;

class Parent2 {
	int compute(int num) {
		if(num >= 1) return num;
		return compute(num - 1) + compute(num - 2);
	}
}

class Child2 extends Parent2 {
	int compute(int num) {
		if(num <= 1) return num;
		return compute(num - 1) + compute(num - 3);
	}
}

public class QuestionNo03 {
	public static void main(String[] args) {
		Parent2 obj = new Child2();
		System.out.println(obj.compute(4));
	}
}
