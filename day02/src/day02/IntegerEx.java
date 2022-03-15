package day02;

public class IntegerEx {

	public static void main(String[] args) {
		
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647; //대략 21억까지
		int c1 = -2147483648;
		
		long d = 234234123123L; //L붙임
		System.out.println(d);
		
		//진수값으로 저장할 수 있음
		//2진수로 저장하려면 0b를 붙임
		//8진수로 저장하려면 0d을 붙임
		//16진수로 저장하려면 0x를 붙임
		int bin =  0b1010;
		System.out.println("이진수 1010은 " + bin + "입니다.");
		
		int octa = 076;
		System.out.println(octa);
		
		
		System.out.println("-----------------------------");
		//실수형타입
		float f1 = 3.14F; //7자리까지 유효
		double d1 = 3.14; //15자리까지
		
		System.out.println(f1);
		System.out.println(d1);
		
		//e표기법
		float f2 = 314.15e-2f;
		System.out.println(f2);
		float f3 = 0.0031415e3f;
		System.out.println(f3);
		
		System.out.println("-----------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}
}
