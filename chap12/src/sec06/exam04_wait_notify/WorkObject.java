package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA 작업 실행");
		notify(); //ThreadB - 일시 정지 상태 -> 실행 대기 상태
		try {
			wait(); //ThreadA - 일시 정지 상태
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB 작업 실행");
		notify(); //ThreadA - 일시 정지 상태 -> 실행 대기 상태
		try {
			wait(); //ThreadB - 일시 정지 상태
		} catch (InterruptedException e) {}
	}
}
