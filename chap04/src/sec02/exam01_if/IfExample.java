package sec02.exam01_if;

public class IfExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90이상 입니다");
			System.out.println("등급은 A입니다");
		}
		
		if(score < 90) {
			System.out.println("점수가 90이하 입니다");
			System.out.println("등급은 B입니다");
		}
		
	}

}
