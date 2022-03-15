package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("종이비행기");
		System.out.println(ap.info());
		
		ap.takeOff();
		ap.fly(); //오버라이드
		ap.flyMode = 1;
		ap.fly();
		
		ap.land();
		
	}
}
