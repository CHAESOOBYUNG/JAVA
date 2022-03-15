package static_.init;

public class Computer {

	public static String company = "LG"; //1번 방법
	public static String model;
	
	public int price;
	
	//정적 초기화자(static변수를 초기화)
	static {
		System.out.println("정적초기화자 호출");
		model = "gram";
	}
	
	
	public Computer(int price) {
		System.out.println("생성자 호출");
		this.price = price;
	
	}
	
}
