package quiz01;

public class Quiz09 {

	public static void main(String[] args) {
		
		/*
		 * Math.random()과  arr.length를 이용해서 0~3랜덤한 정수를 만듭니다.
		 * 
		 * 해당 랜덤수를 배열에 index에 적용해서 
		 * 선택된 단어가 한국어, 영어, 중국어, 알수없는 언어 인지 switch문으로 구별
		 */
		String[] arr = {"안녕", "hello", "니하오", "#$%" };
		int r = (int)(Math.random() * arr.length);
		
		System.out.println("선택된 단어:" + arr[r]);
		
		switch (arr[r]) {
		case "안녕":
			System.out.println("한국어 입니다");
			break;
		case "hello":
			System.out.println("영어 입니다");
			break;
		case "니하오":
			System.out.println("중국어 입니다");
			break;
			
		default:
			System.out.println("알 수 없는 언어 입니다");
			break;
		}
		
		
		
	}
}
