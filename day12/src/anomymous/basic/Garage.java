package anomymous.basic;


interface Car {
	void run(); //추상메서드
}

class Tico implements Car {

	@Override
	public void run() {
		System.out.println("티코~");
	}
	
}


public class Garage {

	//멤버변수
	//public Car car = new Tico();
	
	public Car car = new Car() {
		
		@Override
		public void run() {
			System.out.println("익명객체 티코~");
		}
		
	};
	
	public Car car2 = new Car() {
		
		@Override
		public void run() {
			System.out.println("익명객체 프라이드~");
		}
		
	};
	
	
	
	
	
}
