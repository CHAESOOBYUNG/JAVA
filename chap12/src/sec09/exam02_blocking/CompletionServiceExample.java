package sec09.exam02_blocking;

import java.util.concurrent.*;

public class CompletionServiceExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		); //스레드풀 생성
		
		CompletionService<Integer> completionService = 
				new ExecutorCompletionService<Integer>(executorService); //CompletionService 생성
		
		System.out.println("[작업 처리 요청]");
		for(int i = 0; i < 3; i++) {
			completionService.submit(new Callable<Integer>() { //스레드풀에게 작업처리 요청
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i = 1; i <= 10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[처리 완료된 작업 확인]");
		executorService.submit(new Runnable() { //스레드풀의 스레드에서 실행하도록 함.
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take(); //완료된 작업 가져오기
						int value = future.get();
						System.out.println("[처리 결과] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		
		try {
			Thread.sleep(3000); //3초 후 스레드 종료(스레드가 Callable 처리하기 위한 시간 마련)
		} catch (InterruptedException e) {}
		
		executorService.shutdownNow();
	}
}
