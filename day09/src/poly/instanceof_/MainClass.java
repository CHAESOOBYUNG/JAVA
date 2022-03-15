package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
				
		//다형성 사용
		Person s = new Student("홍길동", 20, "123123");
				
		Person t = new Teacher("신사임당", 40, "문예");
	
		Person e = new Employee("고구마", 2, "우리집강아지");
		
		personInfo(s);
		personInfo(t); //teacher
		personInfo(e); //emp
		
		
	}
	
	public static void personInfo(Person p) {
		
		if(p instanceof Student ) { //p객체가 Student로 생성되었다면 true
			Student s = (Student)p;
			System.out.println(s.info() );
			
		} else if(p instanceof Teacher ) {
			Teacher t = (Teacher)p;
			System.out.println(t.info() );
			
		} else if(p instanceof Employee ) {
			Employee e = (Employee)p;
			System.out.println(e.info() );
		}
		
		
		
	}
	
	
	
	
	
}
