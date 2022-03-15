package day03;

public class IfEx01 {

	public static void main(String[] args) {
		
		//0~100 랜덤 정수
		
		int point = (int)(Math.random() * 101);
		
		System.out.println("점수:" +  point);
		
		//단독으로 작성할수 있습니다.
		if(point >= 60) {
			System.out.println("60점 이상입니다");
			System.out.println("축하합니다");
		} else {
			System.out.println("60점 미만입니다");
			System.out.println("불합격입니다");
		}
		
		
		System.out.println("수고했습니다");
		
		
		
		
		
		
	}
}
