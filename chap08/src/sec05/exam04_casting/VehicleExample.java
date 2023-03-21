package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); -> 컴파일 에러 / Vehicle 인터페이스에 checkFare 메소드 존재 X
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}
	
}
