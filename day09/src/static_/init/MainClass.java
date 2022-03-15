package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 클래스가 호출될 때, 정적초기화자는 
		 * 단 한번 호출 됩니다.
		 */
		
		
		Computer com = new Computer(123);
		
//		System.out.println(Computer.model);
//		System.out.println(Computer.model);
//		System.out.println(Computer.model);
		
	}
}
