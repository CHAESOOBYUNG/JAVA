package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void InternetSearch() {
		System.out.println("인터넷을 검색합니다");
	}
}
