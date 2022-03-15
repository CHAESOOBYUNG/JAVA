package day02;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		//1.배열의 선언
		int[] arr;
		
		//2.배열의 생성
		arr = new int[5];
		System.out.println(arr); //주소값
		
		//3.배열의 초기화
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 200;
		arr[3] = 5;
		arr[4] = 2; //마지막
		
		//4.배열의 사용
		System.out.println("배열의 3번째 상자값:" + arr[2]);
		
		arr[2] = 50;
		System.out.println("배열의 3번째 상자값:" + arr[2]);
		
		//5.배열의 지정된 값을 한눈에 문자열형태로 확인
		System.out.println( Arrays.toString(arr) );
		
		//6.배열의 길이
		System.out.println("arr의 길이:" + arr.length );
		
		//7.배열의 선언과 생성을 한번에.
		byte[] arr2 = new byte[7];
		System.out.println( Arrays.toString(arr2) ); //배열은 초기값을 지정하지 않으면 각 타입의 기본값으로 초기화
		
		//8.배열의 선언과, 생성과, 초기화 한번에.
		int[] arr3 = {1,2,3,4,5};
		
		System.out.println( Arrays.toString(arr3) );
		
		System.out.println("--------------------------------------");
		/*
		 * 크기가 3인 String배열을 생성하고, 월요일,화요일, 수요일을 저장
		 */
		
//		String[] arr4 = {"월요일", "화요일", "수요일" };
		
		String[] arr4 = new String[3];
		arr4[0] = "월요일";
		
		
		
		
		
		
		
		
		
	}
}
