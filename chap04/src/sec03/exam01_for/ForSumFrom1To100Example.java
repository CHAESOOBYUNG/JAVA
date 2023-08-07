package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; //합계 변수
		int i = 0; //카운터 변수
		
		for(i = 1; i <= 100; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("1~" + (i-1) +"까지의 합: " + sum);
	}
	
//	public static void main(String[] args) {
//		int sum = 0; //합계 변수
//		for(int i = 0; i <= 100; i++) {
//			sum += i; // sum = sum + i;
//		}
//		
//		System.out.println("1~100까지의 합: " + sum);
//	}
	
}
