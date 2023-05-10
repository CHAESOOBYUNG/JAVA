package question_bank;

public class QuestionNo21 {
	public static void main(String[] args) {
		/* C언어
		 * #include <studio.h>
		 * main() {
		 * 	   int a, hap = 0;
		 *     for (a = 0; a < 10; ++a, hap += a);
		 *     printf("%d, %d\n", a, hap);
		 * }
		 */
		int a, hap = 0;
		for(a = 0; a < 10; ++a, hap += a);
		System.out.printf("%d %d\n", a, hap);
	}
}
