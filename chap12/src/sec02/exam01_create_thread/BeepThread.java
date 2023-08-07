package sec02.exam01_create_thread;

import java.awt.*;

public class BeepThread extends Thread { //Thread 하위 클래스
	@Override
	public void run() {
		//스레드 실행 내용
		//비프음을 5번 반복해서 소리나게 하는 작업 (동시 실행)
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); //비프음 나게 함.
			try { Thread.sleep(500); } catch (Exception e) {} //0.5초간 thread 일시 정지
		}
	}
}
