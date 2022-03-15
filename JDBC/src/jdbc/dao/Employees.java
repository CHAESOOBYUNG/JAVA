package jdbc.dao;

public class Employees {

	//데이터베이스에서 조회한 변수를 저장할 멤버변수를 선언
	
	private int employee_id;
	private String first_name;
	private String job_id;
	private int department_id;
	
	public Employees() {
		
	}
	//멤버변수를 전달받는 생성자 
	public Employees(int employee_id, String first_name, String job_id, int department_id) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.job_id = job_id;
		this.department_id = department_id;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	
	
	
	
}
