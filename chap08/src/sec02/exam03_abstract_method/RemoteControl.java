package sec02.exam03_abstract_method;

public interface RemoteControl { // 인터페이스 선언
	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; 
	
	// 추상 메소드 선언
	/* public abstract (자동추가) */ void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
