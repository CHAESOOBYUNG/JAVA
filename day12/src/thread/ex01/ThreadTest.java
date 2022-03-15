package thread.ex01;

public class ThreadTest implements Runnable{

	private int num; //0

	@Override
	public void run() {
		//A쓰레드
		for(int i =1; i <=10; i++) {
			
			if(Thread.currentThread().getName().equals("A")) {
				num++;
			}
			
			System.out.println("쓰레드명:" + Thread.currentThread().getName() + ", num:" + num);
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	
	}
	
}
