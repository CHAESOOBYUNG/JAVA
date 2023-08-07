package sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			//모든 필드와 메소드에 접근할 수 있다.
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // 정적 클래스 C - class A로부터 독립적
		void method() {
			//인스터스 필드와 메소드는 접근할 수 없다.
			// field1 = 10; -> class A에 종속되어 사용 가능 -> 컴파일 에러
			// method1(); -> class A에 종속되어 사용 가능 -> 컴파일 에러
			
			field2 = 10;
			method2();
		}
	}
}
