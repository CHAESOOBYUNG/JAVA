package verify.exam12;

import sec12.exam01_wrapper.*;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(intData2);
	}
}
