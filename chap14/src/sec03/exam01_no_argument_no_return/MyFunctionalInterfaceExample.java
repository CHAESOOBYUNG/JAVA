package sec03.exam01_no_argument_no_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str1 = "method call1";
			System.out.println(str1);
		}; //실행문 2개
		fi.method(); //fi 메소드 실행
		
		fi = () -> { System.out.println("method call2"); };
		fi.method(); // 약식 코드 1 -> 실행문 1개
		
		fi = () -> System.out.println("method call3"); 
		fi.method(); // 약식 코드 2 ->  실행문 1개 -> {} 생략 가능 
		
		fi = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("method call4"); 
			}
		}; //실행문 1개 익명객체 = 실행문 1개 람다식
		fi.method();
		
	}
}
