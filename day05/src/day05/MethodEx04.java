package day05;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		//변수명으로 전달
		int[] arr = {1,2,3,4,5}; 
		method01(arr);
		
		int[] arr2 = method02();
		System.out.println(Arrays.toString(arr2) );
	}
	//배열을 매개변수로 전달받는 메서드
	static void method01(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	//배열을 반환하는 메서드
	static int[] method02() {
		int[] arr = {1,2,3};
		return arr;
	}
	
}
