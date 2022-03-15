package collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//tree셋 -> 자동 오름차순 정렬기능
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("강아지");
		tree.add("송아지");
		tree.add("망아지");
		tree.add("냥아지");
		
		System.out.println(tree.toString()); //사전 등재 순 정렬
		
		//항상된 for문
		for(String s : tree) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------");
		TreeSet<Integer> tree2 = new TreeSet<>();
		
		tree2.add(200);
		tree2.add(1);
		tree2.add(1); //중복 x
		tree2.add(35);
		tree2.add(60);
		
		System.out.println(tree2.toString());
		
		
	}
}
