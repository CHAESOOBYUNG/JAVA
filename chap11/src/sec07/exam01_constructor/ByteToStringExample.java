package sec07.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // 문자 코드 번호 배열
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6 , 4); //(bytes, 74번 위치, 4개)
		System.out.println(str2);
	}
	
}
