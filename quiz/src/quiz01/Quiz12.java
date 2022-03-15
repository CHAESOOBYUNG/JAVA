package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		//1. 200까지 정수중에서 3의 배수이거나 4의 배수인 경우에만 가로로 출력 
		
		int a = 1;
		while(a <= 200) {
			
			if(a % 3 == 0 || a % 4 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
		System.out.println();
		
		//2. 100까지 정수중에서 5의 배수의 합계를 구함.
		int sum = 0; //합계변수
		int b = 1;
		while(b <= 100) {
			
			if(b % 5 == 0) {
				sum += b;
			}
			b++;
		} //end 
		System.out.println("1~100까지 5의배수의합:" + sum);
		
		//3. 100까지 정수중의 4의 배수이면서 8의 배수가 아닌 수의 개수. (카운팅을할변수)
		int count = 0; //개수를 셀 변수
		int c = 1;
		while(c <= 10) {
			
			if(c % 4 == 0 && c % 8 != 0 ) {
				count++; //체크
			}
			c++;
		}
		System.out.println("4의 배수이면서, 8의배수가 아닌 개수:" + count);
		
		//4. 스캐너를 이용해서 입력받은 정수까지의 약수출력. 
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num = scan.nextInt(); //약수를 판별할 수
		
		int d = 1;
		while(d <= num) {
			
			if(num % d == 0) { //약수
				System.out.print(d + " ");
			}
			
			d++;
		}
		
		
		
		
	}
}
