package sec05.exam02_treemap;

import java.util.*;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "채수병");
		scores.put(new Integer(98), "오타니");
		scores.put(new Integer(75), "트라웃");
		scores.put(new Integer(95), "디그롬");
		scores.put(new Integer(80), "슈어저");
		
		//내림차순
		NavigableMap<Integer, String> descendingMap = scores.descendingMap(); //내림차순으로 정렬된 Map.Entry의 NavigableMap을 리턴
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		//오름차순
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}
}
