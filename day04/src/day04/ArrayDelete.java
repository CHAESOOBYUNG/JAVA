package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10 };
//		//4번째 인덱스의 삭제
//		for(int i = 4; i < arr.length - 1; i++) { //마지막 전번째 까지 회전
//			arr[i] = arr[i + 1];
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		String[] arr = {"강타", "문희준", "토니안", "장우혁", "이재원" };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할이름>");
		String name = scan.next();
		
		boolean bool = true; 
		int count = arr.length; //배열의 길이를 변수화
		
		for(int i = 0; i < count; i++) { //탐색
			
			if(name.equals(arr[i]) ) { //삭제할 학생을 찾은경우
				System.out.println(arr[i] + "학생을 삭제합니다.");
				//삭제진행
				for(int j = i; j < count-1; j++) {
					arr[j] = arr[j+1];
				}
				//삭제의 의미
				count--;
				bool = false;
				
			}
		} //end outer
		
		if(bool) {
			System.out.println("삭제할 별명이 없습니다");
		} else {
			System.out.println("------삭제후 정보------");
			for(int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
		
		
		
		
	}
}
