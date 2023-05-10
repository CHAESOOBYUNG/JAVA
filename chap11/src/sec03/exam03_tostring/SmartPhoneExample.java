package sec03.exam03_tostring;

public class SmartPhoneExample {
	
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("애플", "ios");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
	
}
