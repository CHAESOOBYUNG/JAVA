package sec07.exam01_enum;

import java.util.Calendar; //Calendar 클래스는 java.util 패키지에 있으므로 import가 필요하다.

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week today = null; //열거 타입 변수 선언
		
		Calendar Cal = Calendar.getInstance();
		int week = Cal.get(Calendar.DAY_OF_WEEK); //일(1) ~ 토(7)까지의 숫자를 리턴
		System.out.println(week);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY; //열거 상수 대입
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
					
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다");
		} else {
			System.out.println("열심히 공부합니다");
		}
		
	}
	
}
