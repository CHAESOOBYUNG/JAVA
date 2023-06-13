package sec03.exam02_console;

import java.io.*;

public class ConsoleExample {
	public static void main(String[] args) { //반드시 cmd에서 실행해야함.
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass); //char[] 배열을 문자열로 생성
		
		System.out.println("----------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}
