package sec05.exam01_state;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) { //객체 생성
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) { //종료
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
