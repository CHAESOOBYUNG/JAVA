package quiz04;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		
	int channel;
	
	//생성자
	DmbPhone(String m, String c, int ch) {
		model = m;
		color = c;
		channel = ch;
	}
	
	void turnOnDmb() {
		System.out.println("TV를 켭니다.");
	}
	
	int changeChannel(int ch) {
		System.out.println("채널변경:" + ch);
		channel = ch; //채널변경
		return channel;
	}
	
	void turnOffDmb() {
		System.out.println("TV를 끕니다.");
	}
	
	
}
