package sec07.exam04_array_management;

public class Tire {
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; //누적 회전수
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire의 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***"  + location + "Tire 펑크 ***");
			return false;
		}
	}
}
