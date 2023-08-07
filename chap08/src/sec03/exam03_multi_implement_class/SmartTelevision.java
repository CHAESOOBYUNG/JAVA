package sec03.exam03_multi_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class SmartTelevision implements Searchable, sec03.exam03_multi_implement_class.RemoteControl {

	private int volume;

	//RemoteControl의 추상 메소드에 대한 실제 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + volume);
	}

	//Searchable의 추상 메소드에 대한 실체 메소드
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}

}
