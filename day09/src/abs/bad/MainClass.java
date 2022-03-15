package abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//프로그래머가 오버라이딩을 빼먹으면, 잘못된 메서드로 실행될 수도 있습니다.
		Store s = new Store();
		s.apple();
		s.grape();
		s.orange();
		s.melon();
		
	}
}
