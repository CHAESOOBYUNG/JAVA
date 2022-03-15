package overriding.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		System.out.println("------------------------");
		
		Child c = new Child();
		c.method01(); //상속
		c.method02(); //오버라이드 메서드
		c.method03(); //자신의메서드
		
	}
}
