package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("채수병"); //새로운 객체 생성
		String strVar2 = "채수병";
		String strVar3 = "채수병";
		String strVar4 = "채승엽";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar2 == strVar3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		if(strVar2.equals(strVar4)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
