package modi.member.pac2;

public class B {

	public B() {
		A a = new A();
		a.v1 = 1;
		a.v2 = 2; //default
//		a.v3 = 3; //private (x)
		
		a.method01();
		a.method02(); //default (o)
//		a.method03(); //private (x)
	}
	
}
