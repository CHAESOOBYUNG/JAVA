package sec06.exam04_wait_notify;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) { //공유 객체(매개값) -> 필드 저장
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		//공유 객체 methodB() - 10번 반복 노출 
		for(int i = 0; i < 10; i++) { 
			workObject.methodB();
		}
	}
}
