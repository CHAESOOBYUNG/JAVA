package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void InternetSearch() {
		System.out.println("인터넷을 검색합니다");
	}
}
