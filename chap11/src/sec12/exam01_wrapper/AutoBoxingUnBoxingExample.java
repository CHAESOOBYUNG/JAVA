package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100; 
		System.out.println("value: " + obj.intValue()); 
		
		//대입시 자동 UnBoxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산식 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
