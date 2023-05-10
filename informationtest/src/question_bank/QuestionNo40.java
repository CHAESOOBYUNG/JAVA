package question_bank;

import java.util.*;

public class QuestionNo40 {
	/* Python (피보나치 수열)
	 * a, b = 1, 1
	 * y = a + b
	 * n = int(input())
	 * for k in range(3, n + 1) :
	 * 	   c = a + b
	 * 	   y = y + c
	 *     a = b
	 *     b = c
	 * print(y)
	 */
	public static void main(String[] args) {
		int a = 1, b = 1, y = a + b;
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int k = 3; k <= n; k++) {
			int c = a + b;
			y = y + c;
			a = b;
			b = c;
		}
		System.out.printf("%d ", y);
	}
}
