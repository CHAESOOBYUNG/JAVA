package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.*;

public class C {
	A a1 = new A(true);
	// A a2 = new A(); // default 접근제한 -> 다른 패키지에서 사용 불가
	// A a3 = new A("문자열"); // private 접근 제한 -> 클래스 제외 다른 곳에서 사용 불가
}
