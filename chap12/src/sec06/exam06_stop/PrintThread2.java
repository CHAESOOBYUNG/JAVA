package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	@Override
	public void run() {
		/* try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1); //InterruptedException 발생
			}
		} catch (InterruptedException e) {} */
		
		/* while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) { //일시정지 X 상황 -> interrupt되었는지 여부 조사
				break;
			}
		} */
		
		while(true) {
			System.out.println("실행중");
			if(isInterrupted()) { //일시정지 X 상황 -> interrupt되었는지 여부 조사
				break; //while문을 빠져나옴
			}
		} 
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
