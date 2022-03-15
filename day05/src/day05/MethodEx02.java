package day05;

public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 실행에 필요한 값을 전달받는 매개체(소괄호 안에 선언)
		 * 2. 매개변수가 여러개면 ,로 연결합니다.
		 */
		
		System.out.println("1~10까지 합:" +  calSum(10) );
		System.out.println("1~20까지 합:" +  calSum(20) );
		System.out.println("1~30까지 합:" +  calSum(30) );
		
		int result = calSum2(10, 20);
		System.out.println("10~20까지 합:" + result);
		
		//calSum3호출
		String result2 = calSum3(1, 10, "a");
		System.out.println(result2);
	}
	
	//매개변수로 전달받은 값까지 합을 리턴하는 메서드
	static int calSum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//매개변수가 여러개인 메서드
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//
	static String calSum3(int a, int b, String s) {
		
		String str = "";
		for(int i = a; i <= b; i++) {
			str += s;
		}
		
		return str;
	}
	
	
	
}
