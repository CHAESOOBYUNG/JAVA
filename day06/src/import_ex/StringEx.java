package import_ex;

public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		/*
		 * 같은 클래스에서 동일 문자열을 저장하면, 같은 String을 가르키지만,
		 * 직접 String생성을 내리거나 다른 클래스에서 넘어온 String은
		 * 다른 주소를 가지게 됩니다.
		 * 
		 * 그래서, String클래스가 제공하는 equals()를 이용해서 문자열 비교를
		 * 해야 합니다.
		 */
		if(str1.equals(str3)  ) {
			System.out.println("문자열 자체가 같음");
		}
		
		
		
		
		
	}
}
