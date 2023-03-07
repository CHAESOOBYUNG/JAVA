package sec03.exam04_break;

public class BreakOuterExample {

	public static void main(String[] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; upper <= 'z'; lower++) {
				System.out.println(upper + "_" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
			
		}
		
	}
	
}
