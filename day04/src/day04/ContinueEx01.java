package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue; //반복문의 다음으로 이동
			}
			
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 0) {
				i++;
				continue; //반복문의 다음으로 이동
			}
			
			System.out.println(i);
			
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
