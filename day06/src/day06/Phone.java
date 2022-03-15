package day06;

public class Phone {

	String model;
	int price;
	String color;

	//생성자: 생성자는 클래스 이름과 동일합니다. 반환유형은 없습니다.
	Phone() {
		System.out.println("생성자호출");
		model = "애니콜";
		price = 200000;
		color = "빨강";
	}
	
	
	//생성자는 중복해서 여러개 선언할 수 있습니다. (생성자 오버로딩)
	//단, 매개변수의 종류or개수를 달라야 합니다.
	Phone(String pColor) {
		model = "팬텍큐리텔";
		price = 300000;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice ) {
		model = "가로본능";
		price = pPrice;
		color = pColor;
		
	}
	
	Phone(String m, int p, String c) {
		model = m;
		price = p;
		color = c;
	}
	
	
	void info() {
		System.out.println("====폰의 정보====");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
	}
	
	
}
