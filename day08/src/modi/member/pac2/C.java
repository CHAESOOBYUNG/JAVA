package modi.member.pac2;

import modi.member.pac1.A;

public class C {

	public C() {
		A a = new A();
		a.v1 = 1; //public
//		a.v2 = 2; //default
//		a.v3 = 3; //private
		
		a.method01(); //public (o)
//		a.method02(); //default (x)
//		a.method03(); //private (x)
	}
	
}
