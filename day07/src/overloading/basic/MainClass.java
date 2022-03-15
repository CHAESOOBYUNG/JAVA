package overloading.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic(); //객체생성
		
		b.input(10);
		b.input("10");
		b.input("문자열", 3.14);
		b.input(3.14, "문자열");
		b.input('A', 65, 3.14);
		
		
		
		
	}
}
