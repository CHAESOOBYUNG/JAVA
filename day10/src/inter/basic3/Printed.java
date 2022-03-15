package inter.basic3;

public interface Printed {
	//클래스가 가져야 할 기능 추상메서드로 정의
	public void turnOn(); //on
	public void turnOff(); //off
	public void print(String document); //출력
	public void colorPrint(String document, String color); //컬러출력
	public int copy(int n);
	
}
