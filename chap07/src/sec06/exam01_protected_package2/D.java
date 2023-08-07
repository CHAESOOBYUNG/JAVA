package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.*;

public class D extends A {
	public D() {
		super(); // (O)
		this.field = "value"; // (O)
		this.method(); // (O)
	}
	
	public void method() {
		this.field = "value";
		this.method();
	}
}