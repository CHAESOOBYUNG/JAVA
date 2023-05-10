package sec11.exam01_arrays;

import java.util.*;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();
		
		String[] names = {"마이크 트라웃", "오타니 쇼헤이", "애런 저지"}; 
		Arrays.sort(names); //자음 순서대로 정렬
		System.out.println(Arrays.toString(names));
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		} 
		System.out.println();
		
		Member m1 = new Member("마이크 트라웃");
		Member m2 = new Member("오타니 쇼헤이");
		Member m3 = new Member("애런 저지");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		} 
	}
}
