package sec02.stream_kind;

import java.util.*;
import java.util.stream.*;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = {"채수병", "오타니", "트라웃"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray); 
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}
}
