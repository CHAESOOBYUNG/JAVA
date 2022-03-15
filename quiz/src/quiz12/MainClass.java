package quiz12;

public class MainClass {

	public static void main(String[] args) {
		MyCart me = new MyCart(2000);
		
		Radio r = new Radio();
		Tv t = new Tv();
		Computer c = new Computer();
		
		me.buy(r);
		me.buy(t);
		me.buy(c);
		
		
		
	}
}
