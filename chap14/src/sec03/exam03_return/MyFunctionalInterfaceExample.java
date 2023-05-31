package sec03.exam03_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5)); //x에 2, y에 5대입
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5)); //x에 2, y에 5대입 -> 약식 코드 1 
		
		fi = (x, y) -> x + y; //return문만 있을 경우 -> {}, return문 생략 가능
		System.out.println(fi.method(2, 5)); //x에 2, y에 5대입 -> 약식 코드 2
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5)); //x에 2, y에 5대입 -> sum 함수 이용
	}
	
	public static int sum (int x, int y) {
		return (x + y);
	}
}
