package sec03.exam06_finalize;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null; //Counter 객체를 쓰레기로 만듦
			System.gc(); //JVM에게 garbage collector를 즉시 실행하도록 요청
			// 무작위 실행
		}
	}
}
