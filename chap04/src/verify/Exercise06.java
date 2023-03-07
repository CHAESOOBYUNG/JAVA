package verify;

public class Exercise06 {
	// 다시 한번 연습하기
	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
		}

	}

}
