package day03;

public class ForEx01 {

	public static void main(String[] args) {
		
		//1~10까지 합 - for
		int sum = 0; 
		for(int i = 1; i <= 10; i++ ) {
			
			sum += i;
		}
		
		System.out.println("합계:" + sum);
		
		System.out.println("-----------------------------------------");
		
		//10~1로 돌아가는 for문
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}
}
