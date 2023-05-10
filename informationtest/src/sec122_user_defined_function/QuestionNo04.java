package sec122_user_defined_function;

import java.util.*;

public class QuestionNo04 {	
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * int func(int a) {
		 * 		if(a <= 1) return 1;
		 * 		return a * func(a - 1);
		 * }
		 * int main() {
		 * 		int a;
		 * 		scanf("%d", &a);
		 * 		printf("%d", func(a) );
		 * }
		 */
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();
		System.out.printf("%d", func(a));
		
	}
	
	public static int func(int a) {
		if(a <= 1) return 1;
		return a * func(a-1);
	}
}
