package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if(i == 5) break;
//			
//		}
		
		
		/*
		 * 무한루프(무한반복문)
		 * -반복문 횟수를 정확히 모를때 사용하고, 자바에서는 while(true)문을 사용합니다.
		 */
		
		int i = 1;
		while(true) {
			
			if(i == 15) break;
			
			System.out.println(i);
			
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
