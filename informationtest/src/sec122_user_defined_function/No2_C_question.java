package sec122_user_defined_function;

public class No2_C_question {
	public static void main(String[] args) {
		/* C언어
		 * # include <stdio.h> 
		 * int factorial (int n);
		 * main() {
		 * 		int (*pf) (int);
		 * 		pf = factorial;
		 * 		printf("%d", pf(3));
		 * }
		 * 
		 * int factorial (int n) {
		 * 		if (n <= 1)
		 * 			return 1;
		 * 		else
		 * 			return n * factorial (n - 1);
		 * }
		 * 
		 * 결과값 - 6
		 */
		
		int result;
		Factorial factorial = new Factorial();
		result = factorial.calculate(3);
		System.out.println(result);
	}
}
	
class Factorial {
	public int calculate(int n) {
		if(n <= 1) 
			return 1;
		else 
			return n * calculate(n - 1);
	}
}
	

