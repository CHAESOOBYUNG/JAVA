package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		//컴퓨터객체생성
		Computer com = new Computer();
		com.computerInfo();
		
		Monitor m = com.getMonitor();
		m.info();
		
	}
}
