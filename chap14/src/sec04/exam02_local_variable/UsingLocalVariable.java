package sec04.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// arg = 31; //final 특성 때문에 수정 불가 (람다식 사용 -> 객체 - final )
		// localVar = 41; //final 특성 때문에 수정 불가 (람다식 사용 -> 객체 - final)
 		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
