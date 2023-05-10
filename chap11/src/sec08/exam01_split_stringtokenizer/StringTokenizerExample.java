package sec08.exam01_split_stringtokenizer;

import java.util.*;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); //꺼내지 않고 남아있는 token의 수
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { //남아있는 token이 있는지 여부
			String token = st.nextToken(); //token을 하나씩 꺼내옴
			System.out.println(token);
		}
	}
}	
