package quiz01;

public class Quiz15 {

	public static void main(String[] args) {
		
		//Math.random()을 사용해서 2~9까지 랜덤수를 만들고, 해당 구구단 for문 출력.
		
		int dan = (int)(Math.random() * 8) + 2;
		
		System.out.println("구구단:" + dan + "단");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
		
		
	}
}
