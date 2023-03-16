package sec08.exam02_abstract_method;

public class Cat extends Animal {
	
	public Cat() {
		this.species = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
