package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start(); //ThreadA, ThreadB 모두 실행
		
		try {
			Thread.sleep(3000); //3초후
		} catch (InterruptedException e) {}
		threadA.work = false; //ThreadB만 실행
		
		try {
			Thread.sleep(3000); //6초후
		} catch (InterruptedException e) {}
		threadA.work = true; //ThreadA, ThreadB 모두 실행
		
		try {
			Thread.sleep(3000); //9초후
		} catch (InterruptedException e) {} 
		
		threadA.stop = true;
		threadB.stop = true;//ThreadA, ThreadB 모두 종료
	}
}
