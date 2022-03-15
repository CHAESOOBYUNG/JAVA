package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/*
		 * 상품번호 (숫자-숫자)
		 * GS25,
		 * (치킨도시락),
		 * 가격
		 * 
		 * 각 요소에 적용해서 출력.
		 */
		String[] arr = {
				"123123-456456 GS25(치킨도시락) 4,400원",
				"123345-234532 GS25(마늘햄쌈) 5,000원"
			
		};
		
		String pattern1 = "[0-9]{6}-[0-9]{6}";
		String pattern2 = "[A-Za-z]+25";
		String pattern3 = "\\([가-힣]+\\)";
		String pattern4 = "[0-9]+,?[0-9]+원";
		
		for(int i = 0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(pattern4).matcher(arr[i]);
			
			while(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println(m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
			
			
		}
		
		
		
	}
}
