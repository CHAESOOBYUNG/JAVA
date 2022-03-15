package overriding.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 10;
		s.name = "홍길순";
		s.studentId = "123123";
		System.out.println(s.info() );
		
		//Employee생성후 확인
		Employee e = new Employee();
		e.age = 20;
		e.name = "홍길자";
		e.department = "회계부";
		System.out.println(e.info());
		
		//Teacher생성후 확인
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "과학";
		System.out.println(t.info() );
		
		
		
	}
}
