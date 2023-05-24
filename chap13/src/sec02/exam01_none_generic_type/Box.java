package sec02.exam01_none_generic_type;

public class Box {
	private Object object;
	
	public void set(Object object) { //모든 자바 객체 저장 가능
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
