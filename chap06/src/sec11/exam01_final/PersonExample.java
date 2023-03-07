package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "이순신");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		// p1.nation = "USA"; // 컴파일 에러(final 필드로 정의된 변수)
		// p1.ssn = "234567-2345678"; // 컴파일 에러(final 필드로 선언된 변수 + 위에서 값을 이미 입력 -> 변경 불가)
		p1.name = "세종대왕";
	}
	
}
