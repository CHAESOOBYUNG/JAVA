package sec11.exam01_arrays;

import java.util.*;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); //arr1 전체를 arr2로 복사 
		System.out.println(Arrays.toString(arr2));
		
		//방법 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //arr[1] ~ arr[2]를 arr3[0] ~ arr3[1]로 복사
		System.out.println(Arrays.toString(arr3));
		
		//방법 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); //arr1 전체를 arr4로 복사
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}
}
