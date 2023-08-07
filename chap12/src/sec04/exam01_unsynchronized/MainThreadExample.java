package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); //User1 스레드 생성
		user1.setCalculator(calculator); //공유 객체 설정
		user1.start(); //User1 스레드 시작
		//User1의 Memory값이 100이 나와야 하지만 User2와 객체 공유 과정에서 오류 발생 -> 50(엉터리 값) 나옴
		
		User2 user2 = new User2(); //User2 스레드 생성
		user2.setCalculator(calculator); //공유 객체 설정
		user2.start(); //User2 스레드 시작
	}
}
