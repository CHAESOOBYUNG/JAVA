package sec07.exam01_constructor_declaration;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("black", 3000);
		//Car myCar = new Car(); - 컴파일 에러 (기본 생성자를 호출할 수 없다.)
	}
	
}
