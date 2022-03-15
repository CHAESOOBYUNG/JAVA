package method;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * type
		 * String, byte, short, int, long, char, boolean
		 * String[]
		 * 반환유형, 이름, (매개변수)
		 */
		
		int[] arr = method02(1, 2);
		ArrayList<String> list = method02(new String[3]);
	}
	

	//1. 정수 2개를 매개변수로 받아서, 정수배열에 담아서 return하는 메서드
	
	static int[] method02 (int a, int b) {
		int[] arr = {a, b};
		
		return arr;
	}
	//2. ArrayList<String> 반환, String[]을 매개변수로 받는다. 
	
	static ArrayList <String> method02(String[] arr) {
		ArrayList<String> list = null;
		
		return list;
	}
	
	//3. Object형 반환, String, ArrayList<String>를 매개변수로 받는다.
	   static Object obj (String a, ArrayList<String> list) {
		 
		   
		   return new Object();
		   
	   }
		
	   
}
