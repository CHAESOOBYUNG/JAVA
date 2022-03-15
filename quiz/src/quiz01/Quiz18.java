package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i+=3) {
			
			for(int j = 1; j <= 9; j++) { //행 = 9번회전
				System.out.print(i + " x " + j + " = " + i*j + "\t");
				System.out.print((i+1) + " x " + j + " = " + (i+1)*j + "\t");
				System.out.print((i+2) + " x " + j + " = " + (i+2)*j );
				
				System.out.println();
			}
			
			System.out.println();
		}
		
		
		
	}
}
