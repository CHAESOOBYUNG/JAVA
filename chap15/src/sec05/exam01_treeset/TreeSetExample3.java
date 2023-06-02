package sec05.exam01_treeset;

import java.util.*;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever"); //f보다 뒤에 있는 단어
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true); // "c" <= 검색 단어 <= "f"
		for(String word : rangeSet) {
			System.out.println(word);
		}
 	}
}
