package sec06.exam02_yield;

public class ThreadB extends Thread {
	public boolean stop = false; //종료 플래그
	public boolean work = true; //작업 진행 여부 플래그
	
	@Override
	public void run() {
		while(!stop) { //stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield(); //work == false -> 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadB 종료");
	}
}
