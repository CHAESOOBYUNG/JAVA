package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1. 1~100까지 랜덤정수를 만들고, 짝수 인지 홀수인지 구분하는 삼항연산식
		int result = (int)(Math.random() * 100) + 1;
		
		String s = result % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result + "는 " + s);
		
		
		//2. -5~5까지의 랜덤정수를 만들고, 절대값을 구하는 삼항연산식
		int result2 = (int)(Math.random() * 11) - 5;
		int abs = result2 > 0 ? result2 : -result2;
		System.out.println(result2 + "의 절대값:" + abs);

		System.out.println("------------------------------------");
		
		//3.숙제
		//bucket는 바구니에 저장될 수 있는 수량.
		//랜덤한 사과개수가 주어질때, 필요한 바구니의 개수를 구하세요.
		//ex ) 사과151개 -> 16개, 사과150개 -> 15개
		int bucket = 10; 
		
		int apple = (int)(Math.random() * 200) + 1; //1~200)
		
		int count = apple % bucket == 0 ? (apple / bucket) : (apple / bucket) + 1;
		
		System.out.println("사과의 개수:" + apple);
		System.out.println("버켓의 개수:" + count + "개 필요합니다");
		
		
		
		
		
	}
}
