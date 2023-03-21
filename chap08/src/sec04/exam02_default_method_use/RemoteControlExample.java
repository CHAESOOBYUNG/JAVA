package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		// RemoteControl.setMute(true); -> 컴파일 에러 / 구현객체 대입 -> 인터페이스 호출 가능
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
