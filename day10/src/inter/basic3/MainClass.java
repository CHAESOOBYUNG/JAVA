package inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		//Printed변수 선언
		Printed p = new Samsung(); //new LG();
		
		p.turnOn();
		p.print("hello world");
		p.colorPrint("abc", "black");
		p.copy(3);
		p.turnOff();
		
		
		
	}
}
