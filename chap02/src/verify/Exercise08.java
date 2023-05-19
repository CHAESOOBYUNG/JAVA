package verify;

public class Exercise08 {
	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
		/* byte result = byteValue + byteValue; -> 컴파일 에러
		   (int) + (int) 연산으로 변환됨 -> byte 타입 수용 불가 */
		
		int result1 = 5 + byteValue;
		float result2 = 5 + floatValue;
		double result3 = 5 + doubleValue;
		
	}
}
