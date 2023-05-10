package question_bank;

public class QuestionNo18 {
	public static void main(String[] args) {
		/* C언어
		 * #include <stdio.h>
		 * #include <stdbool.h>
		 * main() {
		 * 	   int a, b;
		 * 	   bool c, d;
		 * 	   a = 10; b = 0;
		 * 	   a *= b = 5;
		 * 	   c = (a != b);
		 * 	   d = (a == b);
		 * 	   printf("%d, %d, %d\n", a, c, d);
		 * }
		 */
		
		int a, b, c, d;
		a = 10; b= 0;
		a *= b = 5;
		c = (a != b) ? 1 :0;
		d = (a == b) ? 1 : 0;
		System.out.printf("%d, %d, %d\n", a, c, d);
	}
}
