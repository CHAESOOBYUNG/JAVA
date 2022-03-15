package modi.protec.pac2;

import modi.protec.pac1.A;

public class C extends A {

	public C() {
		//default와 사용범위는 같습니다
//		A a = new A();
//		a.bool = true;
//		a.method();
		
		//단, super키워드로 참조는 가능합니다.
		super();
		super.bool = true;
		super.method();
	}
}
