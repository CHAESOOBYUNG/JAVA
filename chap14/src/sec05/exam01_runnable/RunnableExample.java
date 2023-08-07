package sec05.exam01_runnable;

public class RunnableExample {
	public static void main(String[] args) {
		//Runnable 인터페이스 사용 
		/* Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		}; 
		
		Thread thread = new Thread(runnable);
		thread.start(); */
		
		//람다식 사용1 (스레드가 실행하는 코드)
		/* Runnable runnable = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start(); */
		
		//람다식 사용 2 (스레드가 실행하는 코드)
		Thread thread = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}
}
