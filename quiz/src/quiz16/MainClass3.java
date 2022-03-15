package quiz16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		
		/*
		 * 정수 2개를 입력받습니다.
		 * 첫번째 입력받은 수의 랜덤번째 배열값, 두번째 입력받은 랜덤번쨰 배열 값으로
		 * 나눈 결과를 출력하면 됩니다.
		 * 
		 * ex) 3,4를 입력 -> arr[3] / arr[4]
		 * 
		 * 예외가 발생될 수 있는 상황을 3개 이상 종류별로 처리해보세요
		 */
		
		
		String[] arr = {"0", "1", "2", "3", "4", "5"};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수1>");
				int num1 = scan.nextInt(); //1.문자를 입력한 경우
				System.out.print("정수2>");
				int num2 = scan.nextInt();
				
				int n1 = Integer.parseInt( arr[num1] ); //2. arr범위를 벗어난 경우
				int n2 = Integer.parseInt( arr[num2] ); 
				
				System.out.println( n1 / n2 ); // 5 / 0 ->
				break; //출력후 탈출
				
			} catch (InputMismatchException e) {
				System.out.println("반드시 숫자로 입력하세요");
				scan.nextLine(); //엔터값 제거
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("범위는 0~5사이를 입력하세요");
				
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
				
			} catch (Exception e) {
				System.out.println("기타 예외입니다");
			}
			
		}
		
		

		
		
	}
}
