package verify;

public class Exercise04 {

	public static void main(String[] args) {
		/* int sum = 0;
		while(sum != 5) {
			int a = (int)(Math.random()*6) + 1;
			int b = (int)(Math.random()*6) + 1;
			sum = a + b;
			System.out.println("(" + a + "," + b + ")");
		} */
		
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if( (num1 + num2 == 5) ) {
				break;
			}
		}
	}
	
}
