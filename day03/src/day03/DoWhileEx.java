package day03;

public class DoWhileEx {

	public static void main(String[] args) {
		
		//10번 돌아가는 반복
		int sum = 0;
		int a = 1;
		while(a <= 10) {
		
			sum += a;
			
			a++;
		}
		System.out.println("while문으로 합:" + sum);
		System.out.println("--------------------------");
		
		int sum2 = 0;
		int b = 1;
		do {
		
			sum2 += b;
			
			b++;
		} while (b <= 10); //조건이 false라도 무조건 1번은 실행
		
		System.out.println("dowhile문으로 합:" + sum2);
		
		
		
		
	}
	
}
