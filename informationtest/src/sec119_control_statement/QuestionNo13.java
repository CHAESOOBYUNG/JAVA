package sec119_control_statement;

public class QuestionNo13 {
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * int main() {
		 * 	   int number = 1234;
		 * 	   int div = 10, result = 0;
		 * 
		 * 	   while (number > 0) {
		 * 		   result = result * div;
		 * 		   result = result + number % div;
		 * 		   number = number / div;
		 * 	   }
		 * 	   printf(%d, result);
		 * }
		 */
		
		int number = 1234;
		int div = 10, result = 0;
		
		while (number > 0) {
			result = result * div;
			result = result + number % div;
			number = number / div;
		}
		System.out.printf("%d", result);
	}
}
