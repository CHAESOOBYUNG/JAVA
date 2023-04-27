package sec118_data_io;

public class QuestionNo07 {
	/*
	 * # include <studio.h>
	 * main()
	 * {
	 * 		int i = 5, j = 4, k = 1, L, m;
	 * 		L = i > 5 || j != 0;
	 * 		m = j <= 4 && k < 1;
	 * 		printf("%d, %d\n", L, m);
	 * }
	 */
	
	// C언어 -> JAVA
	public static void main(String[] args) {
		int i = 5, j = 4, k = 1;
		boolean L, m;
		L = i > 5 || j != 0;
		m = j <= 4 && k < 1;
		System.out.printf("%d, %d\n", L? 1:0, m? 1:0);
	}
}
