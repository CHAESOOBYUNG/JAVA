package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); //3초 동안 메인 스레드를 일시 정지 상태를 만듦
			} catch (InterruptedException e) {}
		}
	}
}
