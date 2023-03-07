package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	} // for문에 float 사용 -> 쓰레기 값 출력, for문에 되도록이면 int 사용
	
}
