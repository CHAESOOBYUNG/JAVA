package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		
		//작은타입을 큰타입에 넣을 때, 자바가상머신(JVM)이 자동형변환을 진행합니다.
		
		byte a = 10;
		short b = a; //byte -> short형 자동형변환
		int i = a; //byte -> int형
		long l = a;
		
		char c = '가';
		int j = c; //char -> int형 자동형변환
		System.out.println("가의 유니코드숫자값:" + j);
		
		int k = 1000;
		double d = k;
		System.out.println(d);
		
		
	}
}
