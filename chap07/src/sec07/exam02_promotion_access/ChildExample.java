package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		
		parent.method2(); // parent 객체 -> Child 타입 메소드 먼저 참조
		
		// parent.method3(); - 컴파일 에러 / Parent 타입으로 형변환 -> Child 타입 메소드 사용 불가
	}
	
}
