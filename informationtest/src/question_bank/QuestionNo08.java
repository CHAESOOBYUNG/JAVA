package question_bank;

public class QuestionNo08 {
	public static void main(String[] args) {
		/* C언어
		 * include <stdio.h>
		 * main() {
		 * 		  int a = 12, b = 8, c = 2, d = 3;
		 * 		  a /= b++ - c * d;
		 * 		  printf("%d", a);
		 * }
		 */
		int a = 12, b = 8, c = 2, d = 3;
		a /= b++ - c * d;
		System.out.printf("%d", a);
	}
}
