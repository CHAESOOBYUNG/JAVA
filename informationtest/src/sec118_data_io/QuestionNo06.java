package sec118_data_io;

public class QuestionNo06 {
	/*
	 * #include <studio.h>
	 * main() 
	 * {
	 * 		int j = 024, k = 24, L = 0x24, hap;
	 * 		hap = j + k + L;
	 * 		printf("%d, %d, %d, %d\n", j, k, L, hap);
	 * }
	 */
	
	// C언어 -> JAVA
	public static void main(String[] args) {
		int j = 024, k = 24, L = 0x24, hap;
		hap = j + k + L;
		System.out.printf("%d, %d, %d, %d\n", j, k, L, hap);
	}
}
