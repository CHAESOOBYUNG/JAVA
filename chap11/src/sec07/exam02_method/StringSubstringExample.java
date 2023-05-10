package sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "123456-7890123";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
	}
}
