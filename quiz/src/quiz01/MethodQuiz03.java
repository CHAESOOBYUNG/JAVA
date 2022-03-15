package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c'};
		System.out.println( method06(arr) );
		
		int[] arr2 = {1,2,3,4};
		System.out.println( method07(arr2) );
		
		
		String[] arr3 = method08("A", "B");
		System.out.println(Arrays.toString(arr3) );
	}
	
	static String method06(char[] arr) {
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		
		return str;
	}
	
	static int method07(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static String[] method08(String a, String b) {
		
		String[] arr = {a, b};
		
		return arr;
	}
	
	
}
