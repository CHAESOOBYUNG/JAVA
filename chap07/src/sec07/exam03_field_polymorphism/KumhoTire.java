package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire{
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	//출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll() 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***"  + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
