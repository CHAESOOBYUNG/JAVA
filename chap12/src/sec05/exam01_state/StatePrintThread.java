package sec05.exam01_state;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) { //상태를 조사할 스레드
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //스레드 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) { //객체 생성 상태일 경우 실행 대기 상태로 만듦
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) { //종료 상태일 경우 while문을 종료함
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
