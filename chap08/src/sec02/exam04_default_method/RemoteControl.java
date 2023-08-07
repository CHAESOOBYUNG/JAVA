package sec02.exam04_default_method;

public interface RemoteControl { // 인터페이스 선언
	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; 
	
	// 추상 메소드 선언
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드
	// 실행 내용까지 작성
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다");
		}
	}
	
}
