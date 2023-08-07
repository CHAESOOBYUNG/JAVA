package sec03.exam01_member_class_access;

public class A {
	//인스턴스 필드
	B field1 = new B(); // (O)
	C field2 = new C(); // (O)
	
	//인스턴스 메소드
	void method1() { // var - 로컬 변수
		B var1 = new B(); // (O)
		C var2 = new C(); // (O)
	}
	
	//정적 필드
	// static B field3 = new B(); // (X) // -> field3이 정적 필드 -> class A 없이 독립적으로 생성가능 -> 컴파일 에러	
	static C field4 = new C(); // (O)
	
	//정적 메소드
	static void method2() {
		// B var1 = new B(); // (X) // -> method2가 정적 메소드 -> class A 없이 독립적으로 생성가능 -> 컴파일 에러
		C var2 = new C(); // (O)
	}
	
	//인스턴스 멤버 클래스
	class B {}
	
	//정적 멤버 클래스
	static class C {}
}
