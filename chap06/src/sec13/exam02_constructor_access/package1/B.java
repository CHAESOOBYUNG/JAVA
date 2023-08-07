package sec13.exam02_constructor_access.package1; //패키지가 동일

public class B {
	//필드
	A a1 = new A(true); // (O)
	A a2 = new A(); // (O)
	// A a3 = new A("문자열"); // private 접근 제한 -> 클래스 제외 다른 곳에서 사용 불가
}
