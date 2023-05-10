package sec122_user_defined_function;

public class QuestionNo06 {
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * main() {
		 * 		int res = mp(2, 10);
		 * 		printf("%d", res);
		 * }
		 * int mp(int base, int exp) {
		 * 		int res = 1;
		 * 		for(int i = 0; i < exp; i++)
		 * 			res *= base;
		 * 		return res;
		 * }
		 */
		int res = mp(2, 10);
		System.out.printf("%d", res);
	}
	
	public static int mp(int base, int exp) {
		int res = 1;
		for(int i = 0; i < exp; i++)
			res *= base;
		return res;
	}
}
