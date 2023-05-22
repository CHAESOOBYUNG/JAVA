package sec06.exam04_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) { //무한 루프 출력
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
		
		
	}
}
