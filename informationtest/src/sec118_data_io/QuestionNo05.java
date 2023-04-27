package sec118_data_io;

import java.util.*;

public class QuestionNo05 {
	/*
	 * #include <studio.h>
	 * main() {
	 * 		int i, j;
	 * 		scanf("%o#%x", &i, &j);
	 * 		printf("%d %d", i, j);
	 * }
	 * 
	 * <입력>
	 * 15#22
	 */
	
	// C언어 -> JAVA
	
	//15
	//22
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		i = scan.nextInt(8);
		j = scan.nextInt(16);
		System.out.printf("%d %d", i, j);
		scan.close();
	}
}
