package sec03.exam03_local_class_access;

public class Outter {
	//자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8이후
	public void method2(int arg) { //final 특성을 가짐
		int localVariable = 1;
		class inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
