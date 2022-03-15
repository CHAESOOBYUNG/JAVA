package api.lang.wrapper;

public class Boxing {

	public static void main(String[] args) {
		
		//1. 기본타입의 객체형이 wrapper타입
		int a = 100;
		double b = 3.14;
		char c = 'a';
		boolean d = false;
		
		//boxing : 기본타입을 클래스형으로 변환하는 작업
		Integer var1 = new Integer(a);
		Double var2 = new Double(b);
		Character var3 = new Character(c);
		Boolean var4 = new Boolean(d);
		
		Object[] arr = {var1, var2, var3, var4 };
		
		//unboxing : 포장된 객체를 다시 기본형으로 변환하는 작업
		int a1 = var1.intValue();
		double b2 = var2.doubleValue();
		//.....
		
		
		
		
		
		
		
		
		
	}
}
