package sec03.exam03_local_class_access;

public class Outter {
	//자바 7이전
	//final 매개변수와 로컬변수는 로컬클래스의 메소드의 로컬변수로 복사된다.
	//(final을 붙이지 않으면 컴파일 오류 발생)
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (x)
		class inner {
			void method() {
				int result = arg + localVariable; //final 특성 복사됨.
			}
		}
	}
	
	//자바 8이후
	//매개변수와 로컬변수는 final 특성을 가지며, 로컬클래스의 필드로 복사된다.
	public void method2(int arg) { //final 특성을 가짐
		int localVariable = 1;
		class inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
