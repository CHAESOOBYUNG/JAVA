package sec05.exam02_treemap;

import java.util.*;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "채수병");
		scores.put(new Integer(98), "오타니");
		scores.put(new Integer(75), "트라웃");
		scores.put(new Integer(95), "디그롬");
		scores.put(new Integer(80), "슈어저");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry(); //제일 낮은 Map.Entry
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry(); //제일 높은 Map.Entry
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.lowerEntry(95); //주어진 키보다 바로 아래 Map.Entry
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95)); //주어진 키보다 바로 위 Map.Entry
		System.out.println("95점 위 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.floorEntry(new Integer(95)); 
		//주어진 키와 동등한 키 O -> 해당 Map.Entry
		//주어진 키와 동등한 키 X -> 바로 아래 Map.Entry
		System.out.println("95점 이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85)); 
		//주어진 키와 동등한 키 O -> 해당 Map.Entry
		//주어진 키와 동등한 키 X -> 바로 위 Map.Entry
		System.out.println("85점 이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); //오름차순
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}
		
		/* while(!scores.isEmpty()) {
			entry = scores.pollLastEntry(); //내림차순
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		} */
	}
}
