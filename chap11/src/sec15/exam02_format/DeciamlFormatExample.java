package sec15.exam02_format;

import java.text.*;

public class DeciamlFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		// 0 - 10진수(빈자리는 0으로 채움)
		DecimalFormat df = new DecimalFormat("0"); // 소수점 반올림
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0"); // 소수점 둘째자리 반올림
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000"); // 10진수(빈자리는 0으로 채움)
		System.out.println(df.format(num));
		
		// # - 10진수(빈자리는 채우지 않음)
		df = new DecimalFormat("#"); //소수점 반올림
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#"); // 소수점 둘째자리 반올림
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####"); // 10진수(빈자리는 채우지 않음)
		System.out.println(df.format(num));
		
		// 0, # - 혼합
		df = new DecimalFormat("#.0"); // 소수점
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0"); // 양수 기호
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0"); // 음수 기호
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0"); // 단위 구분
		System.out.println(df.format(num));
		
		//지수 문자
		df = new DecimalFormat("0.0E0"); //지수 문자
		System.out.println(df.format(num));
		
		//양수, 음수 패턴 모두 기술
		df = new DecimalFormat("+#,###, -#,###"); //df가 양수 -> 양수 출력 / 음수 -> 음수 출력
		System.out.println(df.format(num));
		
		//100을 곱한 후 % 문자 붙임
		df = new DecimalFormat("#.# %"); //df * 100 %
		System.out.println(df.format(num));
		
		//통화기호 + 10진수(빈자리 X)
		df = new DecimalFormat("\u00A4 #,###"); 
		System.out.println(df.format(num));
	}
}
