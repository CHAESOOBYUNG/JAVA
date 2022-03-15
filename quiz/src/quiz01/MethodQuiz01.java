package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {

		method05("A", 5); //void형
		
		int result = maxNum(5, 10);
		System.out.println("큰수:" + result);
	}
	
	static void method05(String s, int a) {
		
		for(int i = 1; i <= a; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		/*
		int max = 0;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
		*/
		return a > b ? a : b;
	}
	
	
}
