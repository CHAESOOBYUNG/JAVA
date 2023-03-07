package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "채수병";
		String strVar2 = "채수병";
		String strVar3 = new String("채수병");
		
		System.out.println(strVar1 == strVar2); //번지(주소)가 같은지 비교
		System.out.println(strVar1 == strVar3);
		System.out.println(); //한줄 띄기
		System.out.println(strVar1.equals(strVar2)); //문자열이 같은지 비교
		System.out.println(strVar1.equals(strVar3));
		
	}

}
