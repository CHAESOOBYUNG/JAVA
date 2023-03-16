package verify.exam05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); // 부모 메소드 호출 super(사용)
		// this.name = name; -> 필요없음
		this.studentNo = studentNo;
	} 
	
}
