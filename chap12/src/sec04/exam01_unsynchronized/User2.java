package sec04.exam01_unsynchronized;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2"); //스레드 이름을 User2로 설정
		this.calculator = calculator; //공유 객체인 Calculator를 필드에 저장
	}
	
	@Override
	public void run() {
		calculator.setMemory(50); //공유 객체인 Calculator의 메모리에 50을 저장
	}
}
