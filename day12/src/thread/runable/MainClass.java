package thread.runable;

public class MainClass {

	public static void main(String[] args) {
		
		//메인쓰레드
		//Runnable을 구현해서 사용하는 경우에는 해당클래스를 쓰레드객체에 전달.
		ThreadTest th = new ThreadTest();
		
		Thread thread = new Thread(th);
		thread.start();
		
		
		System.out.println("메인쓰레드 끝");
		
		
	}
}
