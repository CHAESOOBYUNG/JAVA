package generic.good;

public class ABC <T> {
    //T를 타입처럼 사용할 수 있습니다.
	//T는 미정상태, 클래스 생성시 결정합니다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
