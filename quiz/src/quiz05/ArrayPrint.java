package quiz05;

public class ArrayPrint {
	/*
	Arrays.toString() 의 기능을 따라하기
	1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
	2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
	2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	main에서 사용.
	*/
	
	String toArray(int[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) break;
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	String toArray(char[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) break;
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	String toArray(String[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) break;
			str += ", ";
		}
		str += "]";
		return str;
	}
}
