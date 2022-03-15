package day03;

public class WhileEx04 {

	public static void main(String[] args) {
		
		//배열과 반복
		int[] arr = {1,2,3,4,5,6,7,8,9,10 };
		
		int sum = 0; //합계변수
		int a = 0;
		while( a < arr.length /*10*/ ) {
			
			sum += arr[a];
			
			a++;
		}
		
		System.out.println("배열 요소의 합:" + sum);
		
		
		
		
	}
}
