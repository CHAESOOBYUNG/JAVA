package inherit;

public class Car {

	//부모클래스
	private String name;
	
	public String info() {
		return "이름:" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
