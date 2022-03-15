package encap.good;

public class Member {

	private String name;
	private String id;
	private String pw;
	private int age;
	private String phone;
	private int zipCode;
	private String addr;
	private String birth;
	
	//CTRL + SPACE + ENTER
	public Member() {
	}
	//생성자 자동생성
	//getter, setter를 자동으로 만듬 alt+shift+s
	public Member(String name, String id, String pw, int age, String phone, int zipCode, String addr, String birth) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.phone = phone;
		this.zipCode = zipCode;
		this.addr = addr;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
