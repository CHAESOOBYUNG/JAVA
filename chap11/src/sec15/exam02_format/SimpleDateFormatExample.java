package sec15.exam02_format;

import java.text.*;
import java.util.*;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss"); //년.월.일 오전/오후 시:분:초 
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일"); //요일
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날"); //월 구분이 없는 일(1~365) 
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날"); //일 
		System.out.println(sdf.format(now));
	}
}
