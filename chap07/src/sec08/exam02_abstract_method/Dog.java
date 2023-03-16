package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	public Dog() {
		this.species = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
