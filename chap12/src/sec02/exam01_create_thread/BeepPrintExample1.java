package sec02.exam01_create_thread;

import java.awt.*;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		//비프음을 5번 반복해서 소리나게 하는 작업 (먼저 실행)
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); //비프음 나게 함.
			try { Thread.sleep(500); } catch (Exception e) {} //0.5초간 thread 일시 정지
		}
		
		//"띵" 문자열을 5번 출력하는 작업 (나중에 실행)
		for(int i = 0; i < 5; i++) {
			System.out.println("띵"); //"띵" 문자열 출력
			try { Thread.sleep(500); } catch (Exception e) {} //0.5초간 thread 일시 정지
		}
	}
}
