package sec122_user_defined_function;

public class QuestionNo03 {
	public static void main(String[] args) {
		/*
		 * #include <stdio.h>
		 * int len(char* p);
		 * 
		 * int main() {
		 * 		char* p1 = "2022";
		 * 		char* p2 = "202207";
		 * 		int a = len(p1);
		 * 		int b = len(p2);
		 * 		printf("%d", a + b);
		 * }
		 * 
		 * int len(char* p) {
		 * 		int r = 0;
		 * 		while(*p != '\0') {
		 * 			p++;
		 * 			r++;
		 * 		}
		 * 		return r;
	 	 * }
		 */
		
		String p1 = "2022";
		String p2 = "202207";
		int a = len(p1);
		int b = len(p2);
		System.out.printf("%d", a + b);
	}
	
	public static int len(String p) {
		int r = 0;
		while(!p.equals("")) {
			p = p.substring(1);
			r++;
		}
		return r;
	}
}
