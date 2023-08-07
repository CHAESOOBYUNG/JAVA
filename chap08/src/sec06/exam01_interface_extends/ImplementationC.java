package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
		@Override
		public void methodA() {
			System.out.println("ImplementationC - methodA() 실행");
		}
		
		@Override
		public void methodB() {
			System.out.println("ImplementationC - methodB() 실행");
		} //InterfaceA와 InterfaceB의 실체 메소드도 있어야 한다.
		
		
		@Override
		public void methodC() {
			System.out.println("ImplementationC - methodC() 실행");
		}
		
	}
