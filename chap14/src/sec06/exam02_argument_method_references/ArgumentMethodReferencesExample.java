package sec06.exam02_argument_method_references;

import java.util.function.*;

public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		//매개 변수의 메소드 참조
		//사전 순으로 a가 b보다 먼저 오면 음수, 동일하면 0, 나중에 오면 양수 리턴
		function = (a, b) -> a.compareToIgnoreCase(b); 
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}
	
	public static void print(int order) {
		if(order < 0) { System.out.println("사전순으로 먼저 옵니다."); }
		else if(order == 0) { System.out.println("동일한 문자열입니다."); }
		else { System.out.println("사전순으로 나중에 옵니다."); }
	}
}
