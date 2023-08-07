package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 95;
		
		if(score>=90) {
			System.out.println("점수가 90이상 입니다");
			System.out.println("등급은 A입니다");
		} else { //score<90일 경우
			System.out.println("점수가 90이하 입니다");
			System.out.println("등급은 B입니다");
		}
		
	}
	
}
