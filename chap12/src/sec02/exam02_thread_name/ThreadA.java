package sec02.exam02_thread_name;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA"); //작업 스레드 이름 변경 (ThreadA 기존 이름: Thread-0) (스레드 이름 설정)
	}
	
	@Override
	public void run() {
		//ThreadA 실행 내용
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용"); //getName() - 스레드 이름 얻기
		}
	}
}
