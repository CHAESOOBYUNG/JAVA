package sec11.exam01_final;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		// nation = "USA"; // 컴파일 에러(final 필드로 정의된 변수)
	}
}
