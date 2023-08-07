package sec13.exam01_class_access.package2; //패키지가 다름

import sec13.exam01_class_access.package1.*;

public class C {
	// A a; //default 접근 제한 -> 사용 불가
	B b; // public package는 import 후 사용 가능
}
