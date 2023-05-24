package sec04.exam01_generic_method;

public class Box <T>{
	private T t;
	
	public void set(T t) { //모든 자바 객체 저장 가능
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
