package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 125;
		
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) { //(i < -128) || (i > 127)
			// Byte.MIN_VALUE = -128 / Byte.MAX_VALUE = 127 / || - or
			System.out.println("byte타입으로 변환할 수 없습니다");
			System.out.println("값을 다시 확인해주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
		

	}

}
