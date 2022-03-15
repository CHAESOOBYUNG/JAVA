package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		String info = "30세/서울시 구로구/02-123-1234/010-1234-1234/kkk@naver.com";
		
		//1. 전화번호형식 
		String pattern1 = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
		
		//정규표현엔진생성
		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(info); //Patern.compile(pattern1).matcher(info)
		
		//find() - 해당 패턴을 찾으면 true 
		//group(), start(), end()
		
		while(m.find()) {
			System.out.println(m.start()); //찾은 처음인덱스
			System.out.println(m.end());   //끝 인덱스
			System.out.println(m.group()); //찾은값
		}
		
		//2. 이메일형식
		String pattern2 = "\\w+@\\w+\\.\\w+";
		
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		
		while(m2.find()) {
			System.out.println(m2.start());
			System.out.println(m2.end());
			System.out.println(m2.group());
		}
		
		
		
		
		
	}
}
