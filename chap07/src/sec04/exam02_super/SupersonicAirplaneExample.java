package sec04.exam02_super;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); // else문 실행
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // if문 실행
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
