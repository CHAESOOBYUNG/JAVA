package day03;

public class EnhancedForEx {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5 };
		
		//일반포문
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int a : arr ) {
			System.out.println(a);
		}
		
		System.out.println("---------------------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for(String s : arr2 ) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------------");
		//향상된 포문을 사용해서 합계를 구하고, 평균(실수부분까지)을 출력
		int[] point = {100, 34, 53, 78, 96 };
		
		int sum = 0;
		for(int a : point  ) {
			sum += a;
		}
		
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum / point.length ); 
		
		
		
		
		
		
		
		
	}
}
