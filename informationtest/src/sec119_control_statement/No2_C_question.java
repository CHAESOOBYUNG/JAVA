package sec119_control_statement;

public class No2_C_question {
	/*
	 * #include <studio.h>
	 * main() {
	 * 		   int score[] == { 86, 53, 95, 76, 61 };
	 * 		   char grade;
	 * 		   char str[] = "Rank";
	 * 		   for(int i = 0; i < 5; i++) {
	 * 				switch (score[i] / 10) {
	 * 				case 10:
	 * 
	 * 				case 9:
	 * 				   grade = 'A';
	 * 				   break;
	 * 				case 8:
	 * 				   grade = 'B';
	 * 				   break;
	 * 				case 7:
	 * 				   grade = 'C';
	 * 				   break;
	 * 				default : grade = 'F';
	 * 				}
	 * 				if (grade != F)
	 * 				printf("%d is %c %s\n", i + 1, grade, str);
	 * 		   }		
	 */
	
	// C언어 -> JAVA
	public static void main(String[] args) {
		int score[] = { 86, 53, 95, 76,61 };
		char grade;
		String str = "RANK"; //  char str[] = "Rank";
		for (int i = 0; i < 5; i++) {
			switch(score[i] / 10) {
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				default: grade = 'F';
			}
			
			if (grade!= 'F')  {
				System.out.printf("%d is %c %s\n", i + 1, grade, str);
			}
				
		}
	}
	
}
