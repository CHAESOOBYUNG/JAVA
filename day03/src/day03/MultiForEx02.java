package day03;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		//바깥회전수에 따라 안쪽 반복의 횟수가 달라지는 경우.
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		int star = 5;
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star+1-i; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄변경
		}
		
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star-i; j++) { //공백출력
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) { //별출력
				System.out.print("*");
			}
			
			System.out.println(); //줄바꿈
		}
		
		/* star변수를 이용해서 출력
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		star = 5;
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= i-1; j++) { //공백출력
				System.out.print(" ");
			}
			
			for(int j = 1; j <= star+1-i; j++) { //별출력
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 
		 */
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();//줄바꿈
		}
		
		
		
		
		
		
		
		
		
	}
}
