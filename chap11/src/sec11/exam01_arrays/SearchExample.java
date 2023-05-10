package sec11.exam01_arrays;

import java.util.*;

public class SearchExample {
	public static void main(String[] args) {
		//기본 타입값 검색
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores); //binarySearch를 사용할 때 정렬을 먼저해야 함
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		//문자열 검색
		String[] names = { "마이크 트라웃", "오타니 쇼헤이", "애런 저지"}; //유니코드 값으로 비교
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "오타니 쇼헤이");
		System.out.println("찾은 인덱스: " + index);
		
		//객체 검색
		Member m1 = new Member("마이크 트라웃");
		Member m2 = new Member("오타니 쇼헤이");
		Member m3 = new Member("애런 저지");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m2);
		System.out.println("찾은 인덱스: " + index);
		
	}
}
