package question_bank;

public class QuestionNo25 {
	public static void main(String[] args) {
		/* C언어
		 * #include <stdio.h>
		 * main() {
		 * 		int a = 2, b = 3, c = 4, d, e;
		 * 		d = a & b & ~b;
		 * 		e = a | b & c;
		 * 		printf("%d %d", d, e);
		 * }
		 */
		int a = 2, b = 3, c = 4, d, e;
		d = a & b & ~b;
		e = a | b & c;
		System.out.printf("%d %d", d, e);
	}
}
