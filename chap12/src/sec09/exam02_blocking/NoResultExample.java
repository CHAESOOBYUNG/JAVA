package sec09.exam02_blocking;

import java.util.concurrent.*;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("[처리 결과] " + sum);
			}
		};
		
		//Future - 지연 완료 객체
		Future future = executorService.submit(runnable); //리턴값 X
		
		try {
			future.get();
			System.out.println("작업 처리 완료");
		} catch (Exception e) {
			System.out.println("[예외 발생함]" + e.getMessage());
		} 
		
		executorService.shutdown();
	}
}
