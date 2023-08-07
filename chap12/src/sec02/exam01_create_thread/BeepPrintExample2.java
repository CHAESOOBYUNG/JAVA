package sec02.exam01_create_thread;

import java.awt.*;

public class BeepPrintExample2 { 
	public static void main(String[] args) { //메인 스레드
		//Thread클래스로부터 직접 생성 
		
		//스레드 실행 방법 1
		/* Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); 
		thread.start(); */
		
		
		//스레드 실행 방법 2
		/* Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				//비프음을 5번 반복해서 소리나게 하는 작업 (동시 실행)
				Toolkit toolkit = Toolkit.getDefaultToolkit(); 
				for(int i = 0; i < 5; i++) {
					toolkit.beep(); //비프음 나게 함.
					try { Thread.sleep(500); } catch (Exception e) {} //0.5초간 thread 일시 정지
				}
			}
		}); 
		thread.start(); */
		
		//스레드 실행 방법 3 (람다식)
		Thread thread = new Thread(() -> {
			//비프음을 5번 반복해서 소리나게 하는 작업 (동시 실행)
			Toolkit toolkit = Toolkit.getDefaultToolkit(); 
			for(int i = 0; i < 5; i++) {
				toolkit.beep(); //비프음 나게 함.
				try { Thread.sleep(500); } catch (Exception e) {} //0.5초간 thread 일시 정지
			}
		});
		
		 thread.start(); //BeepTask의 run()을 동시 실행 (BeepRunnable)
		
		//"띵" 문자열을 5번 출력하는 작업 (동시 실행)
		for(int i = 0; i < 5; i++) {
			System.out.println("띵"); //"띵" 문자열 출력
			try { Thread.sleep(500); } catch (Exception e) {} //0.5초간 thread 일시 정지
		}
	}
}
