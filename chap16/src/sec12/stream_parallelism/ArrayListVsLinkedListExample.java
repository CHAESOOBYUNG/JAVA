package sec12.stream_parallelism;

import java.util.*;

public class ArrayListVsLinkedListExample {
	//요소 처리
	public static void work(int value) {		
	}
	
	//병렬 처리
	public static long testParallel(List<Integer> list){
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
 	}
	
	public static void main(String[] args) {
		//소스 컬렉션
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		for(int i = 0; i < 1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		//워밍업 (실행 준비 과정 오차를 줄임)
		long arrayListParallel = testParallel(arrayList);
		long linkedListParallel = testParallel(linkedList);
		
		//병렬 스트림 처리 시간 구하기
		arrayListParallel = testParallel(arrayList);
		linkedListParallel = testParallel(linkedList);
		
		if(arrayListParallel < linkedListParallel) {
			System.out.println("성능 테스트 결과: ArrayList 처리가 더 빠름");
		} else {
			System.out.println("성능 테스트 결과: LinkedList 처리가 더 빠름");
		}
	}
 }
