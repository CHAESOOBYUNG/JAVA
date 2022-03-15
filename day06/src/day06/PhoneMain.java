package day06;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone blue = new Phone("blue");
		blue.info();
		
		Phone red = new Phone("red", 500000);
		red.info();
		
		//모델, 가격, 색상을 받아서 초기화하는 생성자를 만듭니다.
		//(아이폰, 1000000,하얀색) 으로 객체를 생성하고 확인. 
		
		Phone iPhone = new Phone("iPhone", 1000000, "white");
		iPhone.info();
		
		
	}
}
