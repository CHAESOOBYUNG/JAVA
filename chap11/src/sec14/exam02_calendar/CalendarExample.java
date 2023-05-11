package sec14.exam02_calendar;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //년도
		int month = now.get(Calendar.MONTH) + 1; //월
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		
		int week = now.get(Calendar.DAY_OF_WEEK); //요일
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		/* case Calendar.SUNDAY:
			strWeek = "일";
			break; */
		default:
			strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM); //오전, 오후
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		
		int hour = now.get(Calendar.HOUR); //시
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND); //초
		
		System.out.println(year + "년 " + month + "월 " + day + "일 ");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm);
		System.out.println(hour + "시" + minute + "분" + second + "초");
		
		
	}
}
