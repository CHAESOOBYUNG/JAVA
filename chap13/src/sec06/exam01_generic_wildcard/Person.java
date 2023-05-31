package sec06.exam01_generic_wildcard;

public class Person { //일반인
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
	
	@Override
	public String toString() {
		return name;
	}
}
