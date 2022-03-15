package quiz13;

public abstract class Shape {

	private String name;
	//생성자
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double getArea();
	
	public String getName() {
		return "도형이름:" + name;
	}
	
}
