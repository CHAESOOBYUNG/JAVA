package question_bank;

public class QuestionNo24 {
	public static int a = 1;
	public static void main(String[] args) {
		increase();
		increase();
	}
	
	static void increase() {
		int b = 2;
		System.out.printf("%d, %d\n", ++a, ++b);
	}
}
