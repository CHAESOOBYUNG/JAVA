package sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("오타니 쇼헤이");
		String obj = (String) box.get(); //String -> Object (자동 타입 변환)
		System.out.println(obj); //Object -> String (강제 타입 변환)
		
		box.set(new Apple()); //Apple -> Object (자동 타입 변환)
		Apple apple = (Apple) box.get(); //Object -> Apple(강제 타입 변환)
		//타입 변환 많이 사용 -> 성능 저하
	}
}
