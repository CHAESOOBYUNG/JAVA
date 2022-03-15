package inter.basic;

public class Basic implements Inter1, Inter2 { //여러 인터페이스를 동시에 구현(상속) 받을 수 있습니다.

	@Override
	public void method01() {
		System.out.println("오버라이딩된 1번 메서드");
	}

	@Override
	public void method02() {
		System.out.println("오버라이딩된 2번 메서드");
	}

	public void method03() {
		System.out.println("basic의 3번 메서드");
	}
	
}
