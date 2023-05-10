package sec131_exception_handling;

public class QuestionNo02 {
	public static void main(String[] args) {
		int c = 23, div = 6, result = 0;
		try {
			while (div > -1) {
				div--;
				if (c/div > 10)
					result = div;
			}
		} catch (ArithmeticException e) {
			System.out.print("err01");
			result = -1;
		} catch (IllegalArgumentException e) {
			System.out.print("err02");
			result = -1;
		} catch (NullPointerException e) {
			System.out.print("err03");
			result = -1;
		} finally {
			if (result == -1) 
				System.out.println(" is occured");
		}
	}
}
