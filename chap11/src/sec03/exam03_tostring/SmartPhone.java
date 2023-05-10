package sec03.exam03_tostring;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//toString() 메소드 재정의 -> ctrl + space -> toString() 클릭
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
