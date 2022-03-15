package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		//배열
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		int[] arr = {1,2,3,4,5};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을값>");
		int search = scan.nextInt();
		
		//기초
		int i = 0;
		while(i < arr.length) {
			
			if(search == arr[i]) {
				System.out.println("찾을 값은:" + (i+1) + "번째에 존재합니다");
				break;
			}
			i++;
		}
		
		//i값이 배열길이 까지 증가했다면 찾지 못한경우
		if(i == arr.length) {
			System.out.println(search + "는 배열요소에 없습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
