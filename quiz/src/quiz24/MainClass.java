package quiz24;

public class MainClass {

	public static void main(String[] args) {
		
		//힌트
		/*
		 * 쓰레드 객체 3개, voidThread 3개
		 */
		
		VoteThread v1 = new VoteThread();
		VoteThread v2 = new VoteThread();
		VoteThread v3 = new VoteThread();
		
		Thread t1 = new Thread(v1, "Location1"); //쓰레드 상속객체, 쓰레드명
		Thread t2 = new Thread(v2, "Location2");
		Thread t3 = new Thread(v3, "Location3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
