package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		/*
		 * 하나의 패턴을 만들어서 가격형식만 찾아서 순서대로 출력
		 * 가격) 4,500원, 120000원
		 * 
		 * * - 0회 이상반복: 있을 수도 있고, 없을 수도 있음.
		 */
		String str = "헐 4,500원 ㅎ~ 1,200원헑? 6000원엨 120000원";
		//,? -> ,가 0~1개 나옴
		String pattern1 = "[0-9]+,*[0-9]+원";
		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(str);
		while(m.find()) {
			
			System.out.println(m.group());
		}
	
		
	}
}
