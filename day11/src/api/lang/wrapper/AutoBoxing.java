package api.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		
		//AutoBoxing : 기본타입을 자동으로 객체형으로 형변환(반대의경우도 마찬가지)
		Integer a = 100;
		Double b = 3.14;
		Character c = 'A';
		
		int var1 = a;
		double var2 = b;
		char var3 = c; 
		
		//wrapper클래스는 문자열을 기본형으로 변환하는데 아주 많이 사용됩니다.
		int v1 = Integer.parseInt("3");
		double v2 = Double.parseDouble("3.14");
		long v3 = Long.parseLong("10");
		
		
		
		
	}
}
