package sec11.exam01_arrays;

import java.util.*;

public class EqualsExample {
	public static void main(String[] args) {
		int [][] original = {{1,2}, {3,4}};
		
		//얕은 복사 후 비교 (번지만 복사)
		System.out.println("[얕은 복제 후 비교]");
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(clone1));
		System.out.println("1차배열 항목값 비교: " + Arrays.equals(original, clone1));
		System.out.println("중첩배열 항목값 비교: " + Arrays.deepEquals(original, clone1));
		
		//깊은 복사 후 비교
		System.out.println("\n[깊은 복제 후 비교]");
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(clone2));
		System.out.println("1차배열 항목값 비교: " + Arrays.equals(original, clone2));
		System.out.println("중첩배열 항목값 비교: " + Arrays.deepEquals(original, clone2));
		
		//이것이 자바다 p.523 그림 참고
		
	}
}
