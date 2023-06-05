package verify.exam08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false; //obj가 Student 객체가 아닐 경우
		Student student = (Student) obj;
		if(!(student.studentNum == studentNum)) return false; //studentNum이 같지 않을 경우
		return true;
		/* if(obj instanceof Student) {
			Student student = (Student) obj;
			if(student.studentNum == studentNum) {
				return true;
			} else { //studentNum이 같지 않을 경우
				return false;
			}
		} else { //obj가 Student 객체가 아닐 경우
			return false;
		} */
	}
}
