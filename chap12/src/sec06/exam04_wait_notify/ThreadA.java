package sec06.exam04_wait_notify;

public class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) { //공유 객체(매개값) -> 필드 저장
		this.workObject = workObject; 
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) { //공유 객체 methodA() - 10번 반복 노출 
			workObject.methodA();
		}
	}
}
