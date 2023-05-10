package question_bank;

public class QuestionNo12 {
	public static void main(String[] args) {
		/* Python
		 * a = sum = 0
		 * while a < 10 :
		 * 	   a += 1
		 * 	   if a%2 == 1:
		 * 		   continue
		 * 	   sum += a
		 * print (sum)
		 */
		int sum;
		int a = sum = 0;
		while(a < 10) {
			a += 1;
			if(a%2 == 1) {
				continue;
			}
			sum += a;
		}
		System.out.println(sum);
	}
}
