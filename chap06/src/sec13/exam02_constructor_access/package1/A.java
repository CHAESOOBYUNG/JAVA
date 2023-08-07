package sec13.exam02_constructor_access.package1;

public class A {
	//필드
	A a1 = new A(true); // (O)
	A a2 = new A(); // (O)
	A a3 = new A("문자열"); // (O)
	
	public A(boolean b) {} //public 접근 제한
	A() {} //default 접근 제한
	private A(String s) {} //private 접근 제한
}
