package static_.singleton;

public class Singleton {

	//싱글톤패턴 - 객체가 1개만 생성되도록 클래스를 설계하는 방법
	
	//1. 외부에서 객체를 생성하지 못하도록 생성자를 1개만들고, private을 붙임
	private Singleton() {
		
	}
	
	//2. 멤버변수로 스스로의 객체를 1개 생성
	private static Singleton instance = new Singleton();
	
	//3. 외부에서 클래스생성을 요구할 때, getter를 통해서 2번에서 생성해둔
	//	 하나의 객체를 반환합니다.
	
	public static Singleton getInstance() {
		return instance;
	}
	
	///////////////////////////////////
	private String name = "홍길동";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
}
