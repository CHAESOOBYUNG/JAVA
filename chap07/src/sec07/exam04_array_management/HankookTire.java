package sec07.exam04_array_management;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***"  + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
