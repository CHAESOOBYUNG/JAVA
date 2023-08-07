package sec03.exam01_priority;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread" + i); //스레드 이름
			if(i != 10) {
				thread.setPriority(thread.MIN_PRIORITY); //Thread1 ~ 9는 우선순위 가장 낮게 줌 (가장 낮은 우선순위 설정)
			} else {
				thread.setPriority(thread.MAX_PRIORITY); //Thread10은 우선순위 가장 높게 줌 (가장 높은 우선순위 설정)
			}
			thread.start(); //Thread10 가장 먼저 실행, 나머지 랜덤 실행
		}
	}
}
