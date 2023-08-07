package sec13.exam02_random;

import java.util.*;

public class RandomExample {	
	public static void main(String[] args) {
		//선택 번호
		int[] selectNum = new int[6]; //선택 번호 6개가 저장될 배열 생성
		Random random = new Random(5); //선택 번호를 얻기 위한 Random 객체 생성
		// new Random(종자값); -> if 종자값 X -> 매번 다른 값 / if 종자값 O -> 같은 값 고정
		System.out.print("선택번호: ");
		for(int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1; //선택 번호를 얻어 배열에 저장
			System.out.print(selectNum[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int[] winningNum = new int[6]; //당첨 번호 6개가 저장될 배열 생성
		random = new Random(5); //당첨 번호를 얻기 위한 Random 객체 생성
		// new Random(종자값); -> if (위의 종자값) == (아래 종자값) -> 같은 값 출력
		System.out.print("당첨번호: ");
		for(int i = 0; i < 6; i++) {
			winningNum[i] = random.nextInt(45) + 1; //당첨 번호를 얻어 배열에 저장
			System.out.print(winningNum[i] + " ");
		}
		System.out.println();
		
		//당첨 여부
		//비교하기 전에 정렬시킴
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		
		boolean result = Arrays.equals(selectNum, winningNum); //배열 항목 값 비교
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
