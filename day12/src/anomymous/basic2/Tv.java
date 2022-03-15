package anomymous.basic2;

public class Tv {

	//멤버변수
	private int volume;
	private RemoteControl remote;
	
	public Tv() {
		
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				volume++;
				System.out.println("Tv볼륨:" + volume);
			}
			
			@Override
			public void volumeDown() {
				volume--;
				System.out.println("Tv볼륨:" + volume);
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv를 켜다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끄다");
			}
		};
		
		
	} //end 생성자

	public RemoteControl getRemote() {
		return remote;
	}

	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
	
	
	
}
