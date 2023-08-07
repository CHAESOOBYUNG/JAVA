package sec05.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* public void stop() {
		
	} - 컴파일 에러 / stop메소드는 final 메소드 -> @Override 불가*/
}
