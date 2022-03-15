package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		//static
		Marine.steampack();
		
		m1.location();
		m1.move(5, 3);
		m1.location();
		
		
		
	}
}
