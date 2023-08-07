package sec04.exam01_abstract_method_use;

public class Audio implements RemoteControl {
	//필드
	private int volume;

	//turnOn() 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	//turnOff() 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	//setVolume() 메소드
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + this.volume);
	}
	
}
