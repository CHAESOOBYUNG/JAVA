package sec13.exam02_random;

import java.util.*;

public class RandomExample {	
	public static void main(String[] args) {
		//선택 번호
		int[] selectNum = new int[6];
		Random random = new Random(5); // new Random(종자값); -> if 종자값 X -> 매번 다른 값 / if 종자값 O -> 같은 값 고정
		System.out.print("선택번호: ");
		for(int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			System.out.print(selectNum[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int[] winningNum = new int[6];
		random = new Random(5); // new Random(종자값); -> if (위의 종자값) == (아래 종자값) -> 같은 값 출력
		System.out.print("당첨번호: ");
		for(int i = 0; i < 6; i++) {
			winningNum[i] = random.nextInt(45) + 1;
			System.out.print(winningNum[i] + " ");
		}
		System.out.println();
		
		//당첨 여부
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
