package sec02.exam02_thread_name;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용"); //ThreadB 기존 이름: Thread-1
		}
	}
}
