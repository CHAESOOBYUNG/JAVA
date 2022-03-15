package quiz13;

public class Rect extends Shape {
	/*
	 * 사각형은 생성자를 통해서 이름과, 변의 길이를 받습니다.
	 * getArea()는 사각형의 넓이를 계산하도록 오버라이딩
	 * 
	 * 변의 길이를 저장하는 side변수를 선언.
	 * getter, setter생성
	 */
	
	private int side;
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
	
	//side에 대한 getter
	public int getSide() {
		return side;
	}
	
	
	
}
