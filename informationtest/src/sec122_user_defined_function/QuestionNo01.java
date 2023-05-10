package sec122_user_defined_function;

public class QuestionNo01 {
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * void align (int a[]) {
		 * 		int temp;
		 * 		for (int i = 0; i < 4; i++)
		 * 			for (int j = 0; j < 4 - i; j++)
		 * 				if (a[j] > a[j+1]) {
		 * 					temp = a[j];
		 * 					a[j] = a[j+1];
		 * 					a[j+1] = temp;
		 * 				}
		 * }
		 * 
		 * main() {
		 * 		int a[] = { 85, 75, 50, 100, 95 };
		 * 		align(a);
		 * 		for (int i = 0; i < 5; i++)
		 * 			printf("%d", a[i]);
		 * }
		 * 
		 * 결과값 - 50 75 85 95 100
		 */
		int a[] = { 85, 75, 50, 100, 95 };
		align(a);
		for (int i = 0; i < 5; i++) 
			System.out.printf("%d ", a[i]);
		
		
	}	
	
	public static void align(int a[]) {
		int temp;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4 - i; j++)
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
	}
	
}






