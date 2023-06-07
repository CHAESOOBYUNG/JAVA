package sec02.stream_kind;

import java.util.stream.*;

public class FromIntRangeExample {	
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100); //1~100 하나씩 리턴(100 포함)
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}
}
