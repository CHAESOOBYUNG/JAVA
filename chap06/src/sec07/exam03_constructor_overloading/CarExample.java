package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car(); //생성자 1 선택
		System.out.println("car1.company: " + car1.company);
		System.out.println("car1.model: " + car1.model);
		System.out.println("car1.color: " + car1.color);
		System.out.println("car1.maxSpeed: " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("전기차"); //생성자 2 선택
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
		System.out.println("car2.maxSpeed: " + car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("전기차", "검정"); //생성자 3 선택
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " + car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car("전기차", "검정", 300); //생성자 4 선택
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		
		
	}
	
}
