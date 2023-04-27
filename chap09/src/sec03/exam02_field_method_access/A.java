package sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // 정적 클래스 C - class A로부터 독립적
		void method() {
			// field1 = 10; -> class A에 종속되어 사용 가능 -> 컴파일 에러
			// method1(); -> class A에 종속되어 사용 가능 -> 컴파일 에러
			
			field2 = 10;
			method2();
		}
	}
}
