package sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		// rc = new RemoteControl(); - 인터페이스 구현 클래스 직접 호출 불가
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
	}
}
