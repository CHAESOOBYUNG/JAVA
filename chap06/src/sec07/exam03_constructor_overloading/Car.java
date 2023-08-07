package sec07.exam03_constructor_overloading;

public class Car {
	//필드
	String company = "테슬라";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() { //생성자 1
		
	}
	
	Car(String model) { //생성자 2
		this.model = model;
	}
	
	Car(String model, String color) { //생성자 3
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) { //생성자 4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	/* Car(String model, int maxSpeed, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} - (O) */
	
	/* Car(String color, String model, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} - (X) */
	
}
