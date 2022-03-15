package quiz10;

public class User {

	private String name;
	private int rrn;
	private int age;
	
	//기본생성자
	public User() {
	
	}
	
	//변수 초기화 생성자
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	
	//게터, 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
