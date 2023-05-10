package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class class1 = car.getClass();
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getPackage().getName());
		System.out.println();
		
		try {
			Class class2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(class1.getName());
			System.out.println(class1.getSimpleName());
			System.out.println(class1.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
