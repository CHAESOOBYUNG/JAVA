package question_bank;

public class QuestionNo41 {
	/* C언어
	 * #include <stdio.h>
	 * int isprime(int number) {
	 * 	   int i;
	 * 	   for(i = 2; i < number; i++) 
	 * 		   if (number % i == 0)
	 * 			   return 0;
	 * 	   return 1;
	 * }
	 * 
	 * int main() {
	 * 	   int number = 99, cnt = 0, i;
	 * 	   for(i = 2; i <= number; i++)
	 * 		   cnt = cnt + isprime(i);
	 * 	   printf("%d를 넘지 않는 소수는 %d개입니다.\n", number, cnt);
	 * 	   return 0;
	 * }
	 */
	public static boolean isPrime(int number) {
		int i;
		for(i = 2; i < number; i++) { 
			if(number % i == 0) { 
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number = 99, cnt = 0, i;
		for(i = 2; i <= number; i++) {
			cnt += isPrime(i) ? 1 : 0;
		}
		System.out.printf("%d를 넘지 않는 소수는 %d개입니다.\n", number, cnt);
	}
}