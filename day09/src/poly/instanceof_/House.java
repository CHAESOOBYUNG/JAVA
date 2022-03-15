package poly.instanceof_;

public class House {

	//학생, 티쳐, 임플로이를 저장.
//	private Student[] s;
//	private Teacher[] t;
//	private Employee[] e;
//	
//	private int index01;
//	private int index02;
//	private int index03;
//	
//	public void setStudent(Student s) {
//		this.s[index01] = s;
//		index01++;
//	}
//	
//	public void setEmployee(Employee e) {
//		this.e[index01] = e;
//		index02++;
//	}
//	
//	public void setTeacher(Teacher t) {
//		this.t[index01] = t;
//		index03++;
//	}
	
	//////////////////////////////////////////
	/*
	 * 1. 멤버변수로 크기가 100인 Person배열 선언.
	 * 2. 순서대로 저장할 index변수 1개 선언.
	 * 3. setPerson() 는 Person타입을 매개변수로 받아서
	 *    Person배열에 순서대로 저장하는 기능.
	 * 
	 * 4. 메인클래스에서 6명의 Person을 전달하세요.
	 */
	private Person[] arr = new Person[100];
	private int index;
	
	public void setPerson(Person p) {
		arr[index] = p;
		index++;
		
	}
	
	//arr getter
	public Person[] getArr() {
		return arr;
	}
	
	
	
	
	
}
