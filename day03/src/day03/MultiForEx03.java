package day03;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		//1~10까지 정수 중에서 해당 수의 모든 약수의 합.
		
		int sum = 0; //합계변수
		
		for(int i = 1; i <= 10; i++) { 
			for(int j = 1; j <= i; j++) { //i의 약수를 구할 for문
				//해당수의 약수를 판별
				if(i % j == 0) { //j는 i의 약수
					sum += j;
				}
			}
		}

		System.out.println("1~10까지 정수들의 모든 약수의 합:" + sum);
		
		
		
	}
}
