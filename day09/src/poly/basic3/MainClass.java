package poly.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성이 없다면? -> 클래스를 통일해서 사용할 수 없음
//		Student s = new Student("홍길동", 20, "123123");
//		Student s2 = new Student("홍길자", 20, "111111");
//		Student s3 = new Student("이순신", 30, "222222");
//		
//		Teacher t = new Teacher("신사임당", 40, "문예");
//		Teacher t2 = new Teacher("박찬호", 50, "체육");
//		
//		Employee e = new Employee("고구마", 2, "우리집강아지");
//		
//		Student[] arr = {s ,s2, s3};
//		Teacher[] arr2 = {t, t2 };
//		Employee[] arr3 = {e };
//		
//		for(Student stu : arr ) {
//			System.out.println(stu.info());
//		}
		
		
		
		//다형성 사용
		Person s = new Student("홍길동", 20, "123123");
		Person s2 = new Student("홍길자", 20, "111111");
		Person s3 = new Student("이순신", 30, "222222");
		
		Person t = new Teacher("신사임당", 40, "문예");
		Person t2 = new Teacher("박찬호", 50, "체육");
		
		Person e = new Employee("고구마", 2, "우리집강아지");
		
		Person[] pArr = {s, s2, s3, t, t2, e }; //있다.
		
		for(Person p : pArr ) {
			System.out.println(p.info());
		}
		
		System.out.println("------------------------");
		
		House house = new House();
		house.setPerson(s);
		house.setPerson(s2);
		house.setPerson(s3);
		house.setPerson(t);
		house.setPerson(t2);
		house.setPerson(e);
		
		Person[] arr = house.getArr();
		
		
		
	}
}
