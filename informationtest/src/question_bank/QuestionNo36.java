package question_bank;

public class QuestionNo36 {
	public static void main(String[] args) {
		/* C언어
		 * #include<stdio.h>
		 * main() {
		 * 		int numAry[] = { 0, 0, 0, 0, 3 };
		 * 		int i, j;
		 * 		for(j = 4; j >= 0; --j)
		 * 		   	for(int i = 4; i > j; --i)
		 * 				numAry[j] += numAry[i];
		 * 		for (j = 0;j < 5; ++j)
		 * 			printf("%d ", numAry[j]);
		 * }
		 */
		int numAry[] = { 0, 0, 0, 0, 3 };
		int i, j;
		for(j = 4; j >= 0; --j)
			for(i = 4; i > j; --i)
				numAry[j] += numAry[i];
		for(j = 0; j < 5; ++j)
			System.out.printf("%d ", numAry[j]);
	}
}
