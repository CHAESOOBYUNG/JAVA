package day05;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * 1. 메서드는 만드는과정, 호출(사용)하는 과정이 있습니다.
		 * 2. 메서드는 메서드 내부에 선언할 수 없습니다.
		 */
		
		//1~10
		System.out.println("1~10까지합:" +  calSum()  );
		System.out.println("1~10까지합:" +  calSum()  );
		
		int result = calSum();
		System.out.println("1~10까지합:" + result );
		
		String result2 = randomStr();
		System.out.println(result2);
		
		String result3 = randomStr2();
		System.out.println(result3);
		
	} //end main
	
	static int calSum() {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String randomStr() {
		
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
	}
	
	static String randomStr2() {
		//조건에 따라서 다른 값을 반환
		double d = Math.random();
				
		if(d > 0.6) {
			return "가위";
		} else if(d > 0.3) {
			return "바위";
		} else {
			return "보";
		}
		
		
	}
	
	
	
	
	
	
	
	
}
