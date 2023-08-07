package sec13.exam03_field_method_access.package2; //패키지가 다름

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		// a.field2 = 1; // default 접근제한 -> 다른 패키지에서 사용 불가
		// a.field3 = 3; // private 접근 제한 -> 클래스 제외 다른 곳에서 사용 불가
		
		a.method1();
		// a.method2(); // default 접근제한 -> 다른 패키지에서 사용 불가
		// a.method3(); // private 접근 제한 -> 클래스 제외 다른 곳에서 사용 불가
	}
}
