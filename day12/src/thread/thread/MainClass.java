package thread.thread;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		ThreadTest th = new ThreadTest();
		th.setName("쓰레드2"); //쓰레드이름 지정
		th.start();
		
		
		System.out.println("메인메서드 종료");
		
	}
}
