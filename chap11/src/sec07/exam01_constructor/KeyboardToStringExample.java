package sec07.exam01_constructor;

import java.io.*;

public class KeyboardToStringExample {
	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //키보드로부터 데이터 입력받을 수 있음
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}
}
