package question_bank;

public class QuestionNo15 {
	public static void main(String[] args) {
		/* Python
		 * hap = 0
		 * for i in range(1, 11) :
		 * 	   hap += i
		 * print(i, hap)
		 * 
		 * -> 결과값 - 10 55
		 */
		int hap = 0;
		for(int i = 0; i <= 10; i++) {
			hap += i;
			System.out.println(i + " " + hap);
		}
		
	}
}
