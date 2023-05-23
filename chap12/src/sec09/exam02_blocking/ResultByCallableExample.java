package sec09.exam02_blocking;

import java.util.concurrent.*;

public class ResultByCallableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		Callable<Integer> task = new Callable<Integer>() {
			
			@Override
			public Integer call() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		//Future - 지연 완료 객체
		Future<Integer> future = executorService.submit(task); //리턴값 - Integer
		
		try {
			int sum = future.get();
			System.out.println("[처리 결과] " + sum);
			System.out.println("작업 처리 완료"); // 작업 완료 전까지 블로킹 -> 처리결과 리턴
		} catch (Exception e) {
			System.out.println("[예외 발생함]" + e.getMessage());
		} 
		
		executorService.shutdown();
	}
}
