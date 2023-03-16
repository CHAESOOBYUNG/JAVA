package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2"; - 컴파일 에러 / parent -  Parent 타입 객체 field2 사용 불가
		// parent.method3(); - 컴파일 에러 / parent - Parent 타입 객체 method3() 사용 불가
		
		Child child = (Child) parent; // 강제 타입 변환
		child.field2 = "data2";
		child.method3();
		
	}
}
