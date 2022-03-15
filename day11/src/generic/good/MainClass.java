package generic.good;

public class MainClass {

	public static void main(String[] args) {
		
		//제네릭 클래스 생성 1
		ABC <String> abc = new ABC<String>();
		
		abc.setT("홍길동"); //저장
		String name = abc.getT();
		
		//제네릭 클래스 생성 2 - 제네릭에는 기본형이 저장될 수 없습니다.
		ABC<Integer> abc2 = new ABC <Integer>();
		
		
		//제네릭 클래스 생성 3 - 뒤에 <>는 타입 생략이 가능합니다. 
		ABC<Person> abc3 = new ABC<>();
		
		abc3.setT(new Person() );
		Person p = abc3.getT();
		
		
		
		
		
	}
}
