package abs.good;

public abstract class HeadStore {
	/*
	 * 1. 메서드에 abstract를 붙이면 추상메서드가 됩니다.
	 *    일반클래스에 추상메서드를 선언할 수 없기 때문에, 
	 *    추상메서드를 쓰고 싶다면 추상클래스가 되어야 합니다.
	 * 2. 추상메서드는 {} 없는 메서드의 선언입니다.
	 * 3. 추상클래스는 일반메서드, 일반변수, 생성자 모두 사용가능합니다.
	 */
	
	private String name = "호식이"; //멤버변수
	
	public HeadStore() { //생성자
		
	}
	
	public abstract void apple();
	public abstract void orange();
	public abstract void grape();

	public final void melon() {
		System.out.println("본점에서 판매하는 멜론 600원");
	}
	
	//name에 대한 getter
	public String getName() {
		return name;
	}
	
	
}
