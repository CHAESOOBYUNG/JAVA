package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
//		new HeadStore(); //추상클래스는 객체로 생성불가. 
		
		//부모클래스를 사용하고 싶으면, 자식클래스를 통해서 부모클래스를 구체화시켜야합니다.
		HeadStore h = new Store(); 
		h.apple(); //ov
		h.grape(); //ov
		h.orange();
		h.melon(); 
		System.out.println(h.getName());
		
		
		HeadStore h2 = new Store2();
		h2.apple();
		h2.grape();
		h2.orange();
		h2.melon();
		System.out.println(h2.getName());
		
		
	}
}
