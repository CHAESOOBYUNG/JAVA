package sec14.exam01_getter_setter;

public class Car {
	private int speed; //0
	private boolean stop; //false
	
	public int getSpeed() {
		return speed;
	} //getter
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	} //setter
	
	public boolean isStop() {
		return stop;
	} //getter(boolean 타입)
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0; 
		}
	} //setter(boolean 타입)
	
}
