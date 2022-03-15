package anaonymous.basic2;

public class Computer {

	private int sound;
	private RemoteControl remote;
	
	//생성자
	public Computer() {
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("사운드: " + sound);
			}
			
			@Override
			public void volumeDown() {
				sound--;
				System.out.println("사운드: " + sound);
			}
			
			@Override
			public void turnOn() {
				System.out.println("컴퓨터on");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("컴퓨터off");
				
			}
		};
	}
	
	
	
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
}
