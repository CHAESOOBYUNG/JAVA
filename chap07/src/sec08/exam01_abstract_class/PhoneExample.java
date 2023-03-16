package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone(); - Phone - 추상클래스 -> new 연산자 이용 인스턴스 생성 불가
		
		SmartPhone smartphone = new SmartPhone("채수병");
		smartphone.turnOn();
		smartphone.InternetSearch();
		smartphone.turnOff();
		
	}
}
