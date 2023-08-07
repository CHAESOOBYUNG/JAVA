package sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(byteValue); 
		
		char charValue = '가';
		intValue = charValue; //int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //double <- int
		System.out.println(doubleValue);
		
		longValue = 10000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
		
	}
}
