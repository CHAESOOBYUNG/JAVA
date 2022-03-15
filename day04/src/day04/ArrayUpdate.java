package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		//배열 요소의 수정
		String[] arr = {"강타", "문희준", "토니안", "장우혁", "이재원" };
		

		Scanner scan = new Scanner(System.in);
		System.out.print("찾을이름>");
		String name = scan.next();
		
		//일단 배열요소에 이름 존재여부를 탐색
		boolean bool = true;
		int i = 0;
		while(i < arr.length) {
			
			if(name.equals(arr[i])) {
				System.out.println(arr[i] + "의 별명을 수정합니다.");
				System.out.print(">");
				arr[i] = scan.next(); //입력받은 값으로 변경
				bool = false; //실행되었다는 의미.
			}
			i++;
		}
		
		if(bool) {
			System.out.println("별명이 없습니다");
		} else {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
