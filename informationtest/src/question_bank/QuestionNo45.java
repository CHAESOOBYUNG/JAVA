package question_bank;

import java.util.*;

public class QuestionNo45 {
	public static void main(String[] args) {
		/* C언어
		 * #include <stdio.h>
		 * main() {
		 * 		int num[10];
		 * 		int min = 9999;
		 * 		int i;
		 * 		for(i = 0; i < 10; i++) {
		 * 			scanf(%d, &num[i]);
		 * 		}
		 * 		for(i = 0; i < 10; i++) {
		 * 			if(min > num[i]) {
		 * 				min = num[i];
		 * 			}
		 * 		}	
		 * 		printf("가장 작은 값은 %d이다.", min);
		 * } 
		 */
		
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		int min = 9999;
		int i;
		for(i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
		}
		for(i = 0; i < 10; i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.printf("가장 작은 값은 %d이다.", min);
	}
}
