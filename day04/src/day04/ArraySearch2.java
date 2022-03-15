package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		//선행조건:정렬
		int[] arr = {10, 20, 50, 40, 30, 60, 100, 150, 70 };
		
		//정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을값>");
		int search = scan.nextInt();
		
		int low = 0;
		int high = arr.length - 1;
		boolean bool = false; 
		
		while( low <= high) {
			
			//중간값의 결정
			int mid = (low + high) / 2;
			
			if(arr[mid] == search) {
				System.out.println("찾는값은:" + mid + "번째 index에 존재");
				bool = true;
				break; //탈출
			}
			if(search > arr[mid]) { //찾을값이 중간보다 큰 경우
				low = mid + 1; //중간인덱스 다음번째로 low를 이동
			} else {
				high = mid - 1; //중간인덱스 이전번째로 high를 이동
			}
		} //end while
		
		if(!bool) {
			System.out.println(search + "는 없습니다");
		}
		
		
		
		
		
		
		
		
		
	}
}
