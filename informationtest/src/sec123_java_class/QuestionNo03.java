package sec123_java_class;
class A3{
	  int a;
	  public A3(int a) { this.a = a;}
	  void display() { System.out.println("a=" + a); }
}

class B2 extends A3 {
	public B2(int a) {
		super(a);
		super.display();
	}
}

public class QuestionNo03 {
	public static void main(String[] args) {
		B2 obj = new B2(10);
	}
}
