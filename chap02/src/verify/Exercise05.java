package verify;

public class Exercise05 {
	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		intValue = charValue;
		/* short shortValue = charValue; - 컴파일 에러 
		   -> short는 양수 + 음수 저장 
		   -> char는 양수만 저장 */
		double doubleValue = byteValue;
		
		
	}
}
