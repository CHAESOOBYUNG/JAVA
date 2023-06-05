package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"채수병", "오타니", "트라웃", "슈어저", "디그롬"
		);
		
		//순차처리
		Stream <String> stream = list.stream(); //같은 스레드 사용 
		stream.forEach(ParallelExample :: print); //print 메소드 참조
		
		System.out.println();
		
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();  //다른 스레드 사용
		parallelStream.forEach(ParallelExample :: print); //print메소드 참조
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
