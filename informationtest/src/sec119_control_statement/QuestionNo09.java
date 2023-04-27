package sec119_control_statement;

public class QuestionNo09 {
	public static void main(String[] args) {
		int r = 0;
		for(int i = 0; i < 999; i++) {
			if (i % 3 == 0 && i % 2 == 0)
				r = i;
		}
		System.out.println(r);
	}
}
