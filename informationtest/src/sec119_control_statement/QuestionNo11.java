package sec119_control_statement;

import java.util.*;

public class QuestionNo11 {
	public static void main(String[] args) {
		/*
		 * #include <studio.h>
		 * main() {
		 * 		int i, a[5], cnt = 0;
		 * 		
		 * 		for(i = 0; i < 5; i++) 
		 * 		 	scanf("%d", &a[i]);
		 * 		
		 * 		for(i = 0; i < 5; i++) {
		 * 			if(a[i] % 2 != 0)
		 * 			   cnt = cnt + 1;
		 * 		}
		 * 
		 * 		printf("홀수의 개수 : %d개", cnt);
		 * 		scan.close();
 		 */
		
		int i, cnt = 0;
		int a[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		}
		
		for(i = 0; i < 5; i++) {
			if(a[i] % 2 != 0)
				cnt = cnt + 1;
		}
		
		System.out.printf("홀수의 개수 : %d개", cnt);
			
	}
}
