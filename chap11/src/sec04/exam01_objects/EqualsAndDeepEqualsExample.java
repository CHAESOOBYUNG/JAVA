package sec04.exam01_objects;

import java.util.*;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		/* Integer o1 = new Integer(1000); */
		Integer o1 = 1000; // 위의 것과 같음 
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2)); // o1.equals(o2); -> 같은 값, but 개발자가 o1 변경 힘듦.
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		
		System.out.println();
		
		// 배열
		// int arr1[] = {1, 2};
		// int arr2[] = {1, 2};
		Integer arr1[] = {1, 2};
		Integer arr2[] = {1, 2};
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
	}
}
