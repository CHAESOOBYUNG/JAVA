package sec118_data_io;

import java.util.*;

public class No2_C_Question {
	/* #include <stdio.h>
	 * main() 
	 * {
	 * 		int i, j, k;
	 * 		scanf("%d %d", &i, &j);
	 * 		k = i + j;
	 * 		printf("%d\n", k);
	 * } 
	 */
	
	// C언어 -> Java
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, k;
		System.out.printf("i = ");
		i = scan.nextInt();
		System.out.printf("j = ");
		j = scan.nextInt();
		k = i + j;
		System.out.printf("%d\n", k);
		scan.close();
		
		
	}
	
}
