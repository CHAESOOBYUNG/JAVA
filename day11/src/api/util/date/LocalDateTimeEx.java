package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		//두번째 날짜관련 객체 (time패키지)
		/*
		 * LocalDate - 년,월,일 정보
		 * LocalTime - 시,분,초 정보
		 * LocalDateTime - 년,월,일,시,분,초 모두 가지고 있읍,
		 */
		
		LocalDate now = LocalDate.now(); //현재 날짜
		System.out.println(now);
		
		LocalDate before = LocalDate.of(2015, 01, 11); //날짜 형식을 직접 지정
		System.out.println(before);
		
		System.out.println("----------------------------");
		
		LocalDateTime now2= LocalDateTime.now(); //현재 날짜 시간
		System.out.println(now2);
		
		LocalDateTime before2 = LocalDateTime.of(2015, 02, 11, 15, 19, 20, 40); //날짜 형식을 직접 지정
		System.out.println(before2);
		
	    System.out.println("-----------------------------");
	    //LocalDateTime의 포멧 클래스
	    
	    DateTimeFormatter dt  = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		//LocalDateTime이 가진 format메서드에 formmmater클래스에 전달.
	    String result = now2.format(dt);
	    System.out.println(result);
		
	}
}
