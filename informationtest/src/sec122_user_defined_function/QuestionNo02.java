package sec122_user_defined_function;

public class QuestionNo02 {
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * int r1() {
		 * 		return 4;
		 * }
		 * int r10() {
		 * 		return (30 + r1());
		 * }
		 * int r100() {
		 * 		return (200 + r10());
		 * }
		 * int main() {
		 * 		printf("%d\n", r100());
		 * 		return 0;
		 * }
		 */
		System.out.printf("%d\n", r100());
	}
	
	public static int r1() {
		return 4;
	}
	
	public static int r10() {
		return (30 + r1());
	}
	
	public static int r100() {
		return (200 + r10());
	}
}
