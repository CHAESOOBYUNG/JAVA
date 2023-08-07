package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.*;

public class C {
	public void method() {
		/* A a = new A(); // (X)
		a.field = "value"; // (X)
		a.method(); 8 // (X) 
		-> 컴파일 에러 / default 생성자, 메소드 다른 패키지에서 사용 불가 */
	}
}
