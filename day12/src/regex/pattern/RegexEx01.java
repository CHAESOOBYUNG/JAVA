package regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		/*
		 * 정규표현식(Regular Expression)
			참고 사이트
			http://www.regexper.com
			[주요 기호]
			^		문장의 시작
			$		문장의 끝
			abc		abc가 반드시 나옴
			[abc]		abc중에 1개가 반드시 나옴
			[a-c]		a부터 c사이에서 1개가 반드시 나옴
			[a-c]{5}		a부터 c사이의 글자가 반드시 5개 나옴
			[a-c]{5, 10}	a부터 c사이의 글자가 반드시 5~10개 나옴
			[a-c]{5, }		a부터 c사이의 글자가 반드시 5개 이상 나옴
			
			[a-zA-Z]		알파벳 중 1글자
			[0-9]		숫자중 1개
			[가-힣]		완성된 한글 1글자
			[ㄱ-ㅎ]		자음 1개
			[ㅏ-ㅣ]		모음 1개
			
			a?		a가 있을 수도 있고, 없을 수도 있다(0 or 1)
			a{0, 1}		사용 불가, {}에는 0을 적을 수 없다
			
			특수문자
			\d		[0-9]와 동일
			\w		[a-zA-Z0-9_]와 동일
			\s		white space, 띄어쓰기
			.		아무 글자나 가능(any character)
			[0-9]+		숫자 1개 이상
			[0-9]*		숫자 0개 이상
			[0-9]?		숫자 0개 또는 1개
			
			자바 API에서는 java.util.regex.Pattern 을 가면 상세한 설명이 나옴
		 */
		
		
		//전화번호만 찾아서 ***-****-**** 마스킹 처리.
		String info = "홍길동|30세|서울시 강남구|010-1234-5678";
		
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		
		//매개변수 regex는 메서드는 정규표현형식을 적용할 수 있다는 뜻입니다.
		String result = info.replaceAll(pattern, "***-****-****");
		System.out.println(result);
		
		
		
		
		
		
		
	}
}
