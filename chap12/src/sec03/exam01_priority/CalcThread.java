package sec03.exam01_priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name); //스레드 이름 변경
	}
	
	@Override
	public void run() {
		//스레드가 실행할 내용
		for(int i = 0; i < 2000000000; i++) {
		}
		System.out.println(getName());
	}
}
