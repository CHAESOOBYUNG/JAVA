package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항연산자
		int i = 7 * 3; //21
		int j = 7 / 3; //2
		int k = 7 % 3; //1 
		
		System.out.println("몫:" + j);
		System.out.println("나머지:" + k);
		
		//비교연산자
		System.out.println(i == j); //f
		System.out.println(i != j); //t
		System.out.println(i < j); //f
		System.out.println(k != 1); //f
		
		System.out.println(k % 2 == 0); 
		System.out.println(k % 2 == 1); //홀수판별
		System.out.println(i % 3 == 0); //3의 배수
		
		System.out.println("------------------------------");
		
		//비트연산자
		int a = 5; //0000_0101
		int b = 3; //0000_0011
		
		System.out.println(a & b); //0000_0001 -> 둘다 1이면 1, 나머지 0
		System.out.println(a | b); //0000_0111 -> 둘중 하나만 1이어도 1
		System.out.println(a ^ b); //0000_0110 -> 다르면 1, 같으면 0
		
		//비트 쉬프트 <<, >>
		int h = 192;
		System.out.println(h >> 2);
		
		
		
		
		
	}
}
