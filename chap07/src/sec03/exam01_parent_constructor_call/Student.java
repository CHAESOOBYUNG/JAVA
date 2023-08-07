package sec03.exam01_parent_constructor_call;

public class Student extends People{
	/* public Student() {
		super();
	} - 자동생성 -> 컴파일 오류*/
	
	/* public Student() {	
		super("홍길동", "123456-1234567");
	} - O */
	
	/* public Student(String name, String ssn) {
		super(name, ssn);
	} - O */
	public int studentNo;
	
	/* public Student(String name, String ssn, int studentNo) {
		this.studentNo = studentNo;
		super(name, ssn);
	} - 컴파일 오류 -> super(...) 먼저 선언*/
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모 생성자 호출
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
