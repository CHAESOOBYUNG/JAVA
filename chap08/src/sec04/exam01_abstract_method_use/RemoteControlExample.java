package sec04.exam01_abstract_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null; //인터페이스 변수 선언
		
		rc = new Television(); //Television 객체를 인터페이스 타입에 대입
		
		//인터페이스의 turnOn(), turnOff() 호출
		rc.turnOn();
		rc.turnOff();
		
		rc= new Audio(); //Audio 객체를 인터페이스 타입에 대입
		
		//인터페이스의 turnOn(), turnOff() 호출
		rc.turnOn();
		rc.turnOff();
	}
}
