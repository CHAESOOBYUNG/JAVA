package sec06.exam04_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) { //무한 루프 출력
		WorkObject sharedObject = new WorkObject(); //공유 객체 생성
		
		//ThreadA와 ThreadB 생성
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		//ThreadA와 ThreadB를 실행
		threadA.start();
		threadB.start();
		
		
	}
}
