package sec09.exam01_execute_submit;

import java.util.*;
import java.util.concurrent.*;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2); //스레드풀 생성(최대 스레드 개수: 2)
		//(코어 스레드 개수, 최대 스레드 개수, 놀고 있는 시간, 놀고 있는 시간 단위, 작업 큐)
		
		for(int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() { //작업 정의
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService; 
					int poolSize= threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					int value = Integer.parseInt("삼");
				}
			};
			
			//executorService.execute(runnable); //작업 처리 요청(Runnable을 작업 큐에 저장 / 작업 처리 결과 X)
			executorService.submit(runnable);  //작업 처리 요청(Runnable, Callable을 작업 큐에 저장 / Future를 통해 작업 처리 결과 O)
			Thread.sleep(10);
		}
		
		executorService.shutdown();
		
	}
}
