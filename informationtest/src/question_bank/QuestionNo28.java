package question_bank;

public class QuestionNo28 {
	public static void main(String[] args) {
		/* C언어
		 * #include <stdio.h>
		 * main() {
		 * 		char c[4] = { '+', '-', '/', '*'};
		 * 		double p;
		 * 		switch (c[3])
		 * 		{
		 * 		case '+':
		 * 			 p = 0;
		 * 			 for(int i = 0; i < 5; i++; p += i);
		 * 			 break;
		 * 		case '-':
		 * 			 p = 0;
		 * 			 for(int i = 0; i < 5; i++; p -= i);
		 * 			 break;  
		 * 		case '/':
		 * 			 p = 1;
		 * 			 for(int i = 0; i < 5; i++; p /= i);
		 * 			 break;
		 * 		default:
		 * 			 p = 1;
		 *  		 for (int i = 0; i < 5; i++; p *= i);
		 * 		}
		 * 		printf("%.3f", p);
		 * }
		 */
		char c[] = { '+', '-', '/', '*'};
		double p;
		switch (c[3]) {
		case '+':
			p = 0;
			for (int i = 0; i < 5; i++, p += i);
			break;
		case '-':
			p = 0;
			for (int i = 0; i < 5; i++, p -= i);
			break;
		case '/':
			p = 1;
			for (int i = 0; i < 5; i++, p /= i);
			break;
		default:
			p = 1;
			for (int i = 0; i < 5; i++, p *= i);
		}
		System.out.printf("%.3f", p);
	}
}
