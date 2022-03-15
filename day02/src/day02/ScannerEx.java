package day02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//입력 받는 방법
		//1.스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2.스캐너가 가진 기능을 이용해서 입력받음.
		System.out.print("이름>");
		String name = scan.next();
		
		
		System.out.print("나이>");
		int age = scan.nextInt();
		
		System.out.println("이름:" + name + ", 나이:" + age);
		
		
		//3. 더이상 스캐너의 사용이 필요없다면 자원 해제
		scan.close();
		
		
		
		
	}
}
