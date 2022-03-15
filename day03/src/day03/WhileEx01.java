package day03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int a = 1; //제어변수: 반복문의 횟수를 제어할 변수
		int sum = 0; //누적할 합계변수는 밖에 선언  
		
		while( a <= 10 ) {
			
			sum+=a; //sum = sum + a;
			a++;
		}
		
		System.out.println("1~10까지합:" + sum);
		
		/*
		int sum = 0; 
		sum = sum + 1; 
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		.
		.
		sum = sum + 10;
		
		*/
		
		
		
		
	}
}
