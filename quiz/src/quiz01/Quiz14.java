package quiz01;

import java.util.*;

public class Quiz14 {

	public static void main(String[] args) {
		//입력받은 수 크기의 배열을 생성하고 1~입력받은 수를 저장하는 프로그램코드

		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요>");
		int size = scan.nextInt();
		
		//2. 입력받은 수크기의 배열
		int[] arr = new int[size];
		
		int i = 0;
		while(i < arr.length ) {
			
			arr[i] = i+1;
			
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
	}
}
