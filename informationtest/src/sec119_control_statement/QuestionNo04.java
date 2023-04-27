package sec119_control_statement;

public class QuestionNo04 {
	public static void main(String[] args) {
		int a = 0, sum = 0;
		while(a < 10) {
			a++;
			if(a % 2 == 1) 
				continue;
			sum += a;
		}
		System.out.println(sum);
	}
}
