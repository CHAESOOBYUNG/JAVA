package sec07.exam03_field_polymorphism;

public class Car {
	//필드
	//자동차는 4개의 타이어를 가진다.
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	//모든 타이어를 1회 회전시키기 위해 각 Tire의 객체의 roll() 메소드를 호출한다.
	//false를 리턴하는 roll()이 있을 경우 stop() 메소드를 호출하고 해당 타이어 번호를 리턴한다.
	int run() {
		System.out.println("[자동차가 달립니다]");
		if(frontLeftTire.roll() == false) { // 앞왼쪽 타이어 펑크
			stop();
			return 1;
		}
		
		if(frontRightTire.roll() == false) { // 앞오른쪽 타이어 펑크
			stop();
			return 2;
		}
		
		if(backLeftTire.roll() == false) { // 뒤왼쪽 타이어 펑크
			stop();
			return 3;
		}
		
		if(backRightTire.roll() == false) { // 뒤오른쪽 타이어 펑크
			stop();
			return 4;
		}
		return 0; // 모든 타이어가 정상적으로 굴러감
	}
	
	//펑크 났을 때 실행
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
