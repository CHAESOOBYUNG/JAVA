package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Circle c = new Circle("원", 4);
		System.out.println( c.getName() ); //이름
		System.out.println( c.getArea() ); //넓이
		System.out.println( c.getSide() ); //변의길이
		
		Rect r = new Rect("사각형", 4);
		System.out.println( r.getName() );
		System.out.println( r.getArea() );
		System.out.println( r.getSide() );
	}
}
