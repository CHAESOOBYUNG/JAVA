package sec09.exam03_callback;

import java.nio.channels.*;
import java.util.concurrent.*;

public class CallbackExample {
	private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
	}
	
	//콜백 메소드를 가진 CompletionHandler 객체 생성
	private CompletionHandler<Integer, Void> callback = 
			new CompletionHandler<Integer, Void>() {
			@Override
			public void completed(Integer result, Void attachment) { //Integer - 결과타입, Void - 첨부타입
				System.out.println("completed 실행: " + result);
			}

			@Override
			public void failed(Throwable exc, Void attachment) { //Throwable - 예외타입, Void - 첨부 타입
				System.out.println("failed() 실행: " + exc.toString()); //애러 내용 출력
			}
	};
	
	public void doWork(String x, String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null); //정상 처리했을 경우 호출
				} catch(NumberFormatException e) {
					callback.failed(e, null); //예외가 발생했을 경우 호출
				}
			}
		};
		executorService.submit(task); //스레드풀에게 작업 처리 요청
	}
	
	public void finish() {
		executorService.shutdown(); //스레드풀 종료
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
	}
}
