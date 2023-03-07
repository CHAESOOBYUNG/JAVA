package verify;

public class Exercise05 {

	public static void main(String[] args) {
		// 다시 한번 연습하기
		/* int x = 0;
		int y = 0;
		if(4*x + 5*y == 60) {
		for(x = 1; x <= 10; x++) {
			for(y = 1; y <= 10; y++) {
				System.out.println("(" + x + "," + y + ")");
				}
			}
		} // (x) */
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
