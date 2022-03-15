package day04;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//반복문을 이용한 sort
		int[] arr = {5, 23, 1, 43, 100, 200, 40 };
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) { //스왑
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
