package question_bank;

public class QuestionNo29 {
	public static void main(String[] args) {
		/* C언어
		 * #include <stdio.h>
		 * main() {
		 * 		int a, b = 10;
		 * 		for (a = 0; a < 5; ++a, b -= a);
		 * 		printf("%d %d", a, b);
		 * }
		 */
		int a, b = 10;
		for (a = 0; a < 5; ++a, b-= a);
		System.out.printf("%d, %d", a, b);
	}
}
