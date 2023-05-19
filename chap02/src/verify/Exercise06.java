package verify;

public class Exercise06 {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) intValue;
		/* char var4 = (char) strValue; -> 컴파일 에러
		   -> String 타입, char 타입 서로 변환 불가 */
	}
}
