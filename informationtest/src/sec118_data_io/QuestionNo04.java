package sec118_data_io;

public class QuestionNo04 {
	/*
	 * # include <studio.h>
	 * main()
	 * {
	 * 		int result, a = 100, b = 200, c = 300;
	 * 		result = a < b ? b++ : --c;
	 * 		printf("%d, %d, %d\n, result, b, c);
	 * }
 	 */
	
	// C언어 -> JAVA
	public static void main(String[] args) {
		int result, a = 100, b = 200, c = 300;
		result = a < b ? b++ : c--;
		System.out.printf("%d, %d, %d\n", result, b, c);
	}
}
