package poly.basic;

/*
 * 하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
 * 단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public이 되어야 합니다.
 */
class A extends Object {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	/*
	 * 다형성 - 자식 객체가 부모타입을 가질 수 있는 성질.
	 */
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a2 = b; //B -> A로 클래스 형변환
	A a3 = new B();
	A a4 = new C();
	A a5 = new D();
	A a6 = new E();
	
	//기본타입 멤버변수
	int x = 1;
	double y = x; //int -> double형 변환
	
	
	//상속관계가 없다면 다형성은 적용할 수 없음.
//	B b2 = new E();
	
	//Object타입은 모든 클래스를 저장할 수 있음.
	Object o1 = new A();
	Object o2 = "zzz";
	Object o3 = 1;
	Object o4 = new int[4];
	
	
}




