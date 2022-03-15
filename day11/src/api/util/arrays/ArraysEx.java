package api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		//배열관련 기능 Arrays(static메서드로 만들어져 있습니다)
		int[] arr = {4,65,3,6,5,10,20 };
		
		//정렬
		Arrays.sort(arr);
		
		//배열값을 문자열로 확인
		String result = Arrays.toString(arr);
		System.out.println(result);
		
		//이진탐색 (선행조건 - 정렬)
		int find = Arrays.binarySearch(arr, 4);
		System.out.println("4는:" + find + "번쨰에 있습니다");
		
		int find2 = Arrays.binarySearch(arr, 60);
		System.out.println(find2); //찾는값이 없는 경우 < 0 미만의 값을 반환
		
		//복사 (원본배열, 배열의길이)
		int[] newArr = Arrays.copyOf(arr, arr.length); 
		System.out.println(Arrays.toString(newArr) );
		
		System.out.println(arr); //깊은복사
		System.out.println(newArr);
		
		int[] newArr2 = Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(newArr2) );
		
		//길이지정복사 (원본배열, from, to)
		int[] newArr3 = Arrays.copyOfRange(arr, 2, 3); //2이상 3미만
		System.out.println(Arrays.toString(newArr3) );
		
		//배열의 equals() - 각 요소들이 동일한지 비교
		if(Arrays.equals(arr, newArr)) {
			System.out.println("두 배열의 요소가 같음");
		}
		
		
		
	}
}
