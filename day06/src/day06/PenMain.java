package day06;

public class PenMain {

	public static void main(String[] args) {
		//클래스를 사용할 떄는 펜 객체를 생성해야 합니다.
		Pen redPen = new Pen(); 
		redPen.ink = "빨강";
		redPen.price = 1000;
		redPen.company = "모나미";

		redPen.write();
		redPen.info();

		
		Pen bluePen = new Pen();
		bluePen.ink = "파랑";
		bluePen.price = 2000;
		bluePen.company = "모나미";
		
		bluePen.write();
		bluePen.info();
		
		
		
		///////////////////////////////////
		//Calculator?
		Calculator cal = new Calculator();
		
		
	}
}
