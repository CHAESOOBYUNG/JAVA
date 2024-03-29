package sec04.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result); //현재값으로는 실행 x
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음"); //예외 처리 코드
		}
	}
	
	public static int safeAdd(int left, int right) {
		if (right > 0) {
			if(left > (Integer.MAX_VALUE - right) ) {
				throw new ArithmeticException("오버플로우 발생"); //예외 발생 코드
			}
		} else { //right <= 0일 경우
			if(left < (Integer.MIN_VALUE - right) ) {
				throw new ArithmeticException("오버플로우 발생"); //예외 발생 코드
			}
		}
		
		return left + right;
	}
	
}
