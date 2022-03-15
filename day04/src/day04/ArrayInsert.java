package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//크기 100인 배열
		String[] arr = new String[100];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#먹고싶은 음식입력>");
		System.out.println("#[중지하려면'그만'입력]");
		
		int count = 0; //입력받은 개수를 카운트해서 index로 사용할 변수
		while(true) {
		
			System.out.print(">");
			String menu = scan.nextLine(); //공백을 포함한 문자열을 받습니다.
			
			if(menu.equals("그만") ) { //문자열의 비교
				System.out.println("입력종료");
				break;
			}
			
			arr[count] = menu;
			count++;
		}
		
		String str = "[";
		for(int i = 0; i < count; i++) {
			str += arr[i];
			if(i == count - 1) break; //마지막 직전
			str += ", ";
		}
		str += "]";
		
		System.out.println(str);
		
		
		
		
		
		
		
	}
}
