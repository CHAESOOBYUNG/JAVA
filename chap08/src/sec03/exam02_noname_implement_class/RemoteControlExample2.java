package sec03.exam02_noname_implement_class;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		/* Window -> Show View -> Navigator 
		   chap08 -> bin -> exam02_nonam_implement_class 
		   -> RemoteControlExample2$1.class , RemoteControlExample2$2.class 
		   2개의 클래스 파일 형성
		 */
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				
			}
			
			@Override
			public void turnOff() {
				
			}
			
			@Override
			public void setVolume(int volume) {
				
			}
		};
		
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				
			}
			
			@Override
			public void turnOff() {
				
			}
			
			@Override
			public void setVolume(int volume) {
				
			}
		};
	}
}
