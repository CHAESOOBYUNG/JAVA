package thread.ex01;

public class MainClass {

	public static void main(String[] args) {

		//쓰레드객체 2, 쓰레드Test 2개 각각 실행
        /* 
		ThreadTest th1 = new ThreadTest();
		ThreadTest th2 = new ThreadTest();

		Thread a = new Thread(th1);
		a.setName("A"); //A쓰레드


		Thread b = new Thread(th2);
		b.setName("B"); //B쓰레드

		a.start();
		b.start();
        */
		
		//쓰레드객체 2개, 쓰레드Test 1개 실행
		ThreadTest th = new ThreadTest();
		
		Thread a = new Thread(th);
		a.setName("A");
		
		
		Thread b = new Thread(th);
		b.setName("B");
		
		a.start();
		b.start();
		
		
		
		
		
	}
}
