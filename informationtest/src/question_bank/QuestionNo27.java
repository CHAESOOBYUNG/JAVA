package question_bank;

public class QuestionNo27 {
	public static void main(String[] args) {
		/* Python
		 * i, hap = 0, 0
		 * while(true) : 
		 * 	   i += 1
		 * 	   hap += i
		 *     if i >= 100:
		 *     	   break
		 * print(hap)
		 */
		int i = 0, hap = 0;
		while(true) {
			i += 1;
			hap += i;
			if (i >= 100) {
				break;
			}
		}
		System.out.printf("%d", hap);
	}
}
