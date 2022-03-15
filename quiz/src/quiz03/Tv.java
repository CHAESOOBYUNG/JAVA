package quiz03;

public class Tv {

	String company = "LG";
	int channel;
	boolean power; //전원
	
	//기능(채널변경)
	int changeCh(int ch) {
		channel = ch;
		return channel;
	}
	
	int randomCh() {
		int ch = (int)(Math.random() * 100) + 1;
		channel = ch;
		return channel;
	}
	
	//끄다,키다
	void power() {
		if(power) {
			power = false;
			System.out.println("TV를 끕니다");
		} else {
			power = true;
			System.out.println("TV를 켭니다");
		}
	}
	
	void info() {
		System.out.println("====TV정보====");
		System.out.println("제조사:" + company);
		System.out.println("채널:" + channel);
	}
	
	
	
	
}
