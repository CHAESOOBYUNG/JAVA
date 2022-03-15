package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//날짜객체
		Date date = new Date();
		System.out.println(date);
		
		//Date 클래스의 포멧
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now = sdf.format(date); //매개변수로 날짜클래스 전달.
		
		System.out.println(now);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now2 = sdf.format(date);
		
		System.out.println(now2);
		
		
		
	}
}
