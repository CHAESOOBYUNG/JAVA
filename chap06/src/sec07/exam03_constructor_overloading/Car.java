package sec07.exam03_constructor_overloading;

public class Car {
	String company = "테슬라";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
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
