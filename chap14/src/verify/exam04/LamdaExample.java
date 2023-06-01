package verify.exam04;

import java.util.function.*;

public class LamdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			// x *= 10; //x는 final특성을 가지고 있어 변경이 불가능 -> 컴파일 에러
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		//System.out.println(method(3.5)); //method 함수에선 int 값 2개 대입 가능, double 값 1개 대입 불가 -> 컴파일 에러
	}
}
