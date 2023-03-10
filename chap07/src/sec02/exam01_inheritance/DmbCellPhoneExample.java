package sec02.exam01_inheritance;

public class DmbCellPhoneExample {
	
	public static void main(String[] args) {
		DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmbcellphone.model);
		System.out.println("색상: " + dmbcellphone.color);
		
		System.out.println("채널: " + dmbcellphone.channel);
		
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.powerOff();
		dmbcellphone.sendVoice("Hello");
		dmbcellphone.receiveVoice("안녕하세요");
		dmbcellphone.sendVoice("Hola");
		dmbcellphone.hangUp();
		
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(20);
		dmbcellphone.turnOffDmb();
		
	}
	
}
