package quiz05;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		int[] arr1 = {1,2,3};
		char[] arr2 = {'a', 'b', 'c'};
		
		System.out.println(ap.toArray(arr1) );
		System.out.println(ap.toArray(arr2) );
		
		System.out.println(Arrays.toString(arr1) );
		System.out.println(Arrays.toString(arr2) );
		
		
	}
}
