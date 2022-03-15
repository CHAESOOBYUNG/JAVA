package anaonymous.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
		
		//익명객체전달방식
		//tv.setRemote(new 익명객체());
		
	}
}
