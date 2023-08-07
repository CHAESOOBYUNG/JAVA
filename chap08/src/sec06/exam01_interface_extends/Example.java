package sec06.exam01_interface_extends;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); //InterfaceA 변수는 methodA()만 호출 가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); //InterfaceB 변수는 methodB()만 호출 가능
		System.out.println();
		
		InterfaceC ic = impl;
		//InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
	}
}
