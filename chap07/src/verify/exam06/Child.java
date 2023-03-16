package verify.exam06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		// super(); - super(), this 동시에 사용 불가 -> 둘 다 첫 줄에 있어야 함
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		// super(); - 자동 실행
		this.name = name;
		System.out.println("Child(String name) call");
	}
 }
