package sec05.exam02_gc;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1); //쓰레기 객체
		emp = null;
		emp = new Employee(2); //쓰레기 객체
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc(); //쓰레기 수집기 실행 요청
	}
}
