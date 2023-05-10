package sec118_data_io;

public class QuestionNo10 {
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * main()
		 * {
		 * 		int a = 5, b = 10, c = 15, d = 30, result;
		 * 		result = a * 3 + b > d || c - b / a <= d && 1;
		 * 		printf("%d\n", result);
		 * } - 오류X
		 */
		
		// C언어 -> JAVA
		int a = 5, b = 10, c = 15, d = 30;
		boolean result;
		result = a * 3 + b > d || c - b / a <= d && true; // && 1 -> 오류 발생 문제 해결하기
		System.out.printf("%d\n", result ? 1:0);
	}
}
