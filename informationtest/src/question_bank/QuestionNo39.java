package question_bank;

public class QuestionNo39 {
	/* C언어
	 * #include <stdio.h>
	 * char Stack[Max];
	 * int Top = -1;
	 * 
	 * push(int i) {
	 * 		Top++;
	 * 		if(Top >= Max)
	 * 		  printf("overflow\n");
	 * 		else 
	 * 		  Stack[Top] = i;
	 * }
	 * 
	 * pop() {
	 * 		if (Top < 0)
	 * 		   printf("underflow\n");
	 * 		else 
	 * 		  printf("%c제거\n", Stack[Top--]);
	 * }
	 * 
	 * main() {
	 * 		push('A');
	 * 		push('B');
	 * 		push('C');
	 * 		push('D');
	 * 		push('F');
	 * 		pop();
	 * 		pop();
	 * 		push('G');
	 * 		push('H');
	 * 		pop();
	 * 		pop();
	 * }
	 */
	static int Max = 5;
	static char Stack[] = new char[Max];
	static int Top = -1;
	
	static void push(char i) {
		Top++;
		if (Top >= Max) 
			System.out.printf("overflow\n");
		else
			Stack[Top] = i;
	}
	
	static void pop() {
		if(Top < 0)
			System.out.printf("underflow\n");
		else
			System.out.printf("%c제거\n", Stack[Top--]);
	}
	
	public static void main(String[] args) {
		push('A');
		push('B');
		push('C');
		push('D');
		push('F');
		pop();
		pop();
		push('G');
		push('H');
		pop();
		pop();
	}
}
