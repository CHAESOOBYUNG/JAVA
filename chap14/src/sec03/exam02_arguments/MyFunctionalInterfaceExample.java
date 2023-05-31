package sec03.exam02_arguments;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> { 
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2); //x에 2대입
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(2); //x에 2대입 -> 약식 코드 1
		
		fi = x -> { System.out.println(x*5); }; //매개 변수 1개 -> () 생략 가능
		fi.method(2); //x에 2대입 -> 약식 코드 2
	}
}
