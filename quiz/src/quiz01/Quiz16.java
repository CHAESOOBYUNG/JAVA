package quiz01;

import java.util.Arrays;

public class Quiz16 {

	public static void main(String[] args) {
		
		//1. 7~100사이의 정수중에 7의 배수 가로출력
		for(int i = 7; i <= 100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println();
		//2. 1~100정수 중의 12의 배수 가로출력
		for(int i = 1; i <= 100; i++) {
			if(i % 12 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//3. 50~100사이 두 수 사이의 합
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50~100의 합:" + sum);
		
		//4. char형을 이용해서 A~Z까지 문자열을 가로로 출력
		String str = ""; 
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		System.out.println(str);
		
		//5. 125의 약수의 개수를 구하세요.
		int count = 0;
		for(int i = 1; i <= 125; i++ ) {
			if(125 % i == 0) {
				count++;
			}
		}
		System.out.println("125약수의개수:" + count);
		
		System.out.println("-----------------------------------------");
		//6. 100개의 크기를 가지는 int배열에 3의 배수를 순서대로 저장
		int[] arr = new int[100];
		
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (x+=3);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
