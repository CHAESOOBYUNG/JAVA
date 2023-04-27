package sec118_data_io;

public class QuestionNo02 {
	/*
	 * #include <studio.h>
	 * main() 
	 * {
	 * 		int i = 10, j = 10, k = 30;
	 * 		i /= j;
	 * 		j -= i;
	 * 		k %= j;
	 * 		printf("%d, %d, %d\n", i, j, k);
	 * }
	 */
	
	// C언어 -> JAVA
	public static void main(String[] args) {
		int i = 10, j = 10, k = 30;
		i /= j;
		j -= i;
		k %= j;
		System.out.printf("%d, %d, %d\n", i, j, k);
	}
	
}
