package sec02.exam01_nestedclass_object;

public class A {
	A() { // 메소드
		System.out.println("A객체가 생성됨");
		
		/* B b = new B();	
		b.field1 = 3;
		b.method1(); - B객체가 생성됨 */
	}
	
	class B { // 인스턴스 맴버 클래스
		int field1;
		// static int field2; - 인스턴스 맴버 클래스에서 정적 변수 생성 불가
		B() {
			System.out.println("B객체가 생성됨");
		}
		
		void method1() {
			
		}
		
		/* static void method2() {
			
		} - 인스턴스 맴버 클래스에서 정적 메소드 생성 불가 */
	}
	
	static class C { // 정적 클래스
		int field1;
		static int field2; // static class에서 생성 가능
		C() {
			System.out.println("C객체가 생성됨");
		}
		
		void method1() {
			
		}
		
		static void method2() {
			
		}
	}
	
	void method() { // 로컬 클래스
		class D {
			int field1;
			// static int field2; // 로컬 클래스에서 정적 변수 생성 불가
			D() {
				System.out.println("D객체가 생성됨");
			}
			
			void method1() {
				
			}	
			/* static void method2() {
				
			} - 로컬 클래스에서 정적 메소드 생성 불가 */
			
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
