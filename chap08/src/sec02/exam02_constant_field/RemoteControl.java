package sec02.exam02_constant_field;

public interface RemoteControl { // 인터페이스 선언
	// 상수 선언
	/* public static final (자동 추가) */ int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; 
	/* int MIN_VOLUME;
	
	static {
		MIN_VOLUME = 0;
	} -> static 사용 불가 -> 직접 선언 */ 
}
