package sec05.exam01_treeset;

import java.util.*;

public class TreeSetExample1 {
	public static void main(String[] args) {
		//이진 트리(TreeSet) - 부모노드 값 > 자식노드 값 -> 자식 노드 왼쪽 위치 
		//부모노드 값 < 자식노드 값 -> 자식 노드 오른쪽 위치
		TreeSet<Integer> scores = new TreeSet<Integer>(); 
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first(); //가장 왼쪽에 있는 객체(가장 낮은 객체)
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last(); //가장 오른쪽에 있는 객체(가장 높은 객체)
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(new Integer(95)); //주어진 객체보다 바로 아래 객체
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95)); //주어진 객체보다 바로 위 객체
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(new Integer(95)); //주어진 객체와 동등한 객체 O -> 동등한 객체
		//주어진 객체와 동동한 객체 X -> 주어진 객체 바로 아래 객체
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85)); //주어진 객체와 동등한 객체 O -> 동등한 객체
		//주어진 객체와 동등한 객체 X -> 주어진 객체 바로 위 객체
		System.out.println("85점 이거나 바로 위 점수: " + score +"\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollLast(); //내림차순
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")"); 
		} 
		
		/* while(!scores.isEmpty()) {
				score = scores.pollFirst(); //오름차순
				System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
			} */
		
		/* Iterator<Integer> iterator = scores.iterator();
		   while(iterator.hasNext()) {
				int s = iterator.next();
				iterator.remove();
				System.out.println(s + "(남은 객체 수: " + scores.size() + ")");
		   } */
	}
}
