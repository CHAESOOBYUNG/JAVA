package sec07.exam02_method;

public class StringToLowerUpperClassExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		String upperStr3 = str1.toLowerCase();
		String upperStr4 = str2.toLowerCase();
		System.out.println(upperStr3.equals(upperStr4));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
