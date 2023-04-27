package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() { 
				String studentNo;
				void study() {
					System.out.println("공부합니다");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다");
					study();
				}		
		} );
	}
}

