package sec07.exam04_other_constructor_call;

public class Car {
	String company = "테슬라";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		/* this.model = model;
		this.color = null;
		this.maxSpeed = 0; */
		this(model, null, 0); //호출
	}
	
	Car(String model, String color) {
		/* this.model = model;
		this.color = color;
		this.maxSpeed = 0; */
		this(model, color, 0); // 다른 생성자 호출 -> 반드시 첫 줄에 와야만 함
		System.out.println("Car(String model) 실행");
	}
	
	Car(String model, String color, int maxSpeed) { 
		//공통 실행 코드
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
