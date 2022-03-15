package thread.thread;

public class ThreadTest extends Thread {
	//Thread클래스 자체를 상속받아 쓰는 경우
    //run메서드 오버라이딩
	
	@Override
	public void run() {
		System.out.println( getName()); //쓰레드이름
		
		System.out.println("쓰레드2 시작");
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	    System.out.println("쓰레드2 끝");
	}
	
	
	
	
}
