package day02;

public class CastingEx02 {

	public static void main(String[] args) {
		
		//크기가 큰 타입을 작은타입에 넣을때는 (type)캐스팅을 이용해서
		//명시적 형변환을 해야합니다 
		int i = 70;
		char c = (char)i;
		short s = (short)i;
		
		float f = 3.14F;
		int j = (int)f;
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(j);
		
		//강제형변환시 주의할점은, 값을 받을 수 없는 범위가 들어오면 잘린값이 저장됩니다.(쓰레기값)
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b);
		
		//char -> short로 바꿀 때도 형변환이 필요
		char cc = 'A';
		short ss = (short)cc;
		
		
		
		
		
		
	}
}
