package question_bank;

public class QuestionNo42 {
	/* C언어
	 * #include <stdio.h>
	 * #define s 6
	 * 
	 * void bubble_sort(int list[]) {
	 * 		int j, k, p, tmp;
	 * 		for (j = 1; j <s; j++) {
	 * 		    for (k = 0; k < s - j; k++) {
	 * 				if(list[k] > list[k+1]) {
	 * 					tmp = list[k];
	 * 					list[k] = list[k+1];
	 * 					list[k+1] = tmp;
	 * 				}
	 * 				for (p = 0; p < s; p++) 
	 * 					printf("%d", list[p]);
	 * 				printf("\n");
	 * 			}			
	 * 		}
	 * }
	 * main() {
	 * 		int list[s] = { 9, 4, 3, 6, 8, 1} ;
	 * 		int i;
	 * 
	 * 		for (i = 0; i < s; i++)
	 * 			printf("%d", list[i])
	 * 		printf("\n")
	 * 
	 * 		bubble_sort(list); */
	public static final int s = 6;
	public static void bubbleSort(int list[]) {
		
		int j, k, p, tmp;
		for(j = 1; j < s; j++) {
			for(k = 0; k < s - j; k++) {
				if(list[k] > list[k+1]) {
					tmp = list[k];
					list[k] = list[k+1];
					list[k+1] = tmp;
				}
				for(p = 0; p < s; p++) 
					System.out.printf("%d", list[p]);
				System.out.printf("\n");
				
			}
		}
	}
	
	public static void main(String[] args) {
		int list[] = { 9, 4, 3, 6, 8, 1 };
		int i;
		
		for(i = 0; i < s; i++) 
			System.out.printf("%d", list[i]);
		System.out.print("\n");
		
		bubbleSort(list);
	}
}
