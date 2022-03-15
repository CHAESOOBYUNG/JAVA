package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) {
		
//		System.out.printf("%-3s", "x");
//		System.out.printf("%-3s", "x");
//		System.out.printf("%-3s", "x");
//		System.out.printf("%-3s", "x");
		
		/*
		 * 사람수를 입력받아서 자리를 배정할 수 있도록 하는 프로그램
		 * 
		 * 1. 사람수를 입력받을 수 있습니다.
		 * 2. 입력받은 사람수 만큼 랜덤값을 생성해서 배열에 중복되지
		 *    않도록 랜덤하게 지정합니다.
		 * 
		 * 3. 해당 배열의 크기만큼 o으로 출력해주세요 (ㅁ한자9)
		 * 4. 선택좌석을 입력받아서, 제대로 된 좌석이라면 자리번호를 공개하고
		 * 	  제대로 선택되지 않은 좌석이라면, 다시 입력받으세요. 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요>");
		int size = scan.nextInt();
		
		
		int[] arr = new int[size];
		
		int i = 0;
		es:while(true) {
			
			int num = (int)(Math.random() * size) +1;
			//i직전까지 회전
			for(int j = 0; j < i; j++) {
				if(num == arr[j]) continue es; 
			}
			arr[i] = num;
			i++;
			
			if(i == size) break;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		while(true) {
			System.out.println("===============좌석배정==============");
			
			for(int j = 0; j < size; j++ ) {
				System.out.printf("%-3d" , j+1 ); //출력을할때 3칸을 잡고 좌측에서부터 출력
			}
			System.out.println(); //줄변경
			
			
			for(int j = 0; j < size; j++) {
				if(arr[j] != 0) {
					System.out.printf("%-3s", "○");
				} else {
					System.out.printf("%-3s", "●" );
				} 
				
			}
			System.out.println(); //줄변경
			
			//좌석입력
			System.out.print("좌석선택>>");
			int seat = scan.nextInt();
			
			//
			if(arr[seat-1] != 0) {
				System.out.println("자리번호:" + arr[seat-1]);
				arr[seat-1] = 0;
			} else {
				System.out.println("이미 선택한 자리입니다.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
