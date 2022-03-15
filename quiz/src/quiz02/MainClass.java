package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		
		System.out.println("===================");
		//(직접 생성자를 만들게 되면 기본생성자를 자동생성하지 않습니다)
		Person p2 = new Person();
		p2.name = "이순신";
		p2.age = 40;
		p2.tall = 170;
		
		p2.info();
		
		
	}
}
