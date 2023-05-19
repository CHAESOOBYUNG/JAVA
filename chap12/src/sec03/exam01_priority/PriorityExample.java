package sec03.exam01_priority;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i != 10) {
				thread.setPriority(thread.MIN_PRIORITY); //Thread1 ~ 9는 우선순위 가장 낮게 줌
			} else {
				thread.setPriority(thread.MAX_PRIORITY); //Thread10은 우선순위 가장 높게 줌
			}
			thread.start(); //Thread10 가장 먼저 실행, 나머지 랜덤 실행
		}
	}
}
