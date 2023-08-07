package sec07.exam03_field_polymorphism;

public class Tire {
	//필드
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; // 타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location; //타이어의 위치 초기화
		this.maxRotation = maxRotation; //최대 회전수(타이어 수명) 초기화
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1 증가
		if(accumulatedRotation < maxRotation) {
			//정상 회전 (누적(최대)일 경우 실행)
			System.out.println(location + "Tire의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			//펑크(누적=최대)일 경우 실행
			System.out.println("***"  + location + "Tire 펑크 ***");
			return false;
		}
	}
}
