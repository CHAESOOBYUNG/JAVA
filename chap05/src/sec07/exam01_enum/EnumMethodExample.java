package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		Week weekday = Week.valueOf("SUNDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이군요");
		} else {
			System.out.println("평일이군요");
		}
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day: days) {
			System.out.println(day);
		}
	}
	
}
