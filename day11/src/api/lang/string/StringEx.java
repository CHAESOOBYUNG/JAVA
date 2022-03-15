package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
//		char[] arr = {'안', '녕', '하', '세', '요', '~', '~' };
//		String str = new String(arr);
		
		String str = "안녕하세요~~"; 
		System.out.println(str);
		
		//charAt - 인덱스번호 자르기
		char c = str.charAt(0);
		System.out.println(c);
		
		//indexof - 특정문자를 앞에서 찾기시작해서 있다면, 인덱스번호 반환
		int i =  str.indexOf("~");
		System.out.println(i);
		
		//lastindexof - 특정문자를 뒤에서 찾기시작해서 있다면, 인덱스번호 반환
		int i2 = str.lastIndexOf("~");
		System.out.println(i2);
		
		//length
		System.out.println("문자열길이:" + str.length() );
		for(int j = 0; j < str.length(); j++ ) {
			System.out.println( str.charAt(j) + "-" + str.charAt( str.length()-1 - j)  );
			
		}
		
		System.out.println("--------------------------------------------------");
		
		String str2 = "자바는 어렵습니다. 자바는 커피집 이름입니다";
		
		//replace
//		String result = str2.replace("자바", "java");
//		System.out.println(result);
		
		str2 = str2.replace("자바", "java");
		System.out.println(str2);
		
		//replaceAll - replace와 기능은 같고, 정규표현형식도 사용가능
		str2 = str2.replaceAll("java", "자바");
		System.out.println(str2);
		
		//replaceFirst 
		str2 = str2.replaceFirst("자바", "java");
		System.out.println(str2);
		
		//공백제거
		str2 = str2.replace(" ", "");
		System.out.println(str2);
		
		System.out.println("-------------------------------------------------------");
		
		//substring - 문자열 자르기
		String str3 = "900101-1111111";
		String result3 = str3.substring(7); //매개값을 한개주면 앞문자열 제거 
		System.out.println(result3);
		
		String result4 = str3.substring(7, str3.length() ); //매개값을 두개주면 이상~미만 문자열을 추출
		System.out.println(result4);
		
		//split - 특정문자 기준으로 문자를 잘라서 배열형태로 반환
		String[] result5 = str3.split("-");
		System.out.println(Arrays.toString(result5) );
		
		System.out.println("------------------------------------");
		//toUppercase - 대문자로 치환
		String str4 = "abcdef";
		str4 = str4.toUpperCase();
		System.out.println(str4);
		
		//trim - 앞뒤공백제거
		String str5 = "   coding404 ";
		str5 = str5.trim();
		System.out.println(str5);
		
		//valueOf - 기본타입을 문자열로 변환(static)
		System.out.println( String.valueOf(3) + String.valueOf(4)  );
		System.out.println( "" + 3 + 4);
		
		
		
		
	}
}
