package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		/* Animal animal = new Dog();
		 * Dog dog = (Dog) animal;
		
		   Cat cat = (Cat) animal; // ClassCastException 발생 */
		
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat); // ClassCastException 발생
	}
	
	public static void changeDog (Animal animal) {
		// Dog dog = (Dog) animal; // ClassCastException 발생 가능
		
		if(animal instanceof Dog) { 
			Dog dog = (Dog) animal; 
		} else {
			System.out.println("Dog로 변환이 어렵습니다.");
		}
	}
}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}