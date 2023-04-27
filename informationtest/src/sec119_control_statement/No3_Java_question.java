package sec119_control_statement;

public class No3_Java_question {
	public static void main(String[] args) {
		String str = "agile";
		int x[] = { 1, 2, 3, 4, 5 };
		char y[] = new char[5];
		int i = 0;
		
		while(i < str.length()) {
			y[i] = str.charAt(i); // y[i]에 str의 i번째 문자 저장
			i++;
		}
		
		for(int p : x) {
			i--;
			System.out.print(y[i]);
			System.out.print(p + " ");
		}
	}
}
