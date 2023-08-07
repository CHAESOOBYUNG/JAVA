package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// B b2 = e; -> 컴파일 에러 / E클래스는 C클래스를 상속받음. (상속 관계에 있지 않음)
		// C c2 = d; -> 컴파일 에러 / D클래스는 B클래스를 상속받음. (상속 관계에 있지 않음)
	}
	
}
