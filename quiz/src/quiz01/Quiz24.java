package quiz01;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		String[] arr = {"무지", "네오", "어피치", "라이언", "단무지" };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을이름>");
		String name = scan.next();
		
		boolean bool = false; //if문의 실행여부 
		
		int i = 0;
		while(i < arr.length) {
			
			if(name.equals(arr[i]) ) {
				System.out.println( (i+1) + "에 있습니다" );
				bool = true; //실행의 의미
				break;
			}
			
			i++;
		}
		
		
		if(!bool) {
			System.out.println(name + "은 없습니다");
		}
		
		
		
		
		
	}
}
