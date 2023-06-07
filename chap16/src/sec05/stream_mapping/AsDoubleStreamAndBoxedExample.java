package sec05.stream_mapping;

import java.util.*;
import java.util.stream.*;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArr);
		intStream
			.asDoubleStream() //DoubleStream 생성
			.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream = Arrays.stream(intArr);
		intStream
			.boxed() //Stream<Integer> 생성
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
