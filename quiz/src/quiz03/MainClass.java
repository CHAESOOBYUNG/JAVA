package quiz03;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 현실에서 찾아볼 수 있는 물건, 등등 생각해서 클래스로 표현
		 * 멤버변수 2개이상, 메서드 2개이상
		 * 설계하고, 메인에서 사용 
		 */
		
		Tv tv = new Tv();
		tv.power(); 
		System.out.println(tv.changeCh(10) ); //10변경
		System.out.println(tv.randomCh() ); //랜덤변경
		tv.info();
		tv.power();
		
		
		
		
	}
}
