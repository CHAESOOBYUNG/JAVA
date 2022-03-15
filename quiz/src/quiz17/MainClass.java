package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		try {
			int result = cal.inputTest();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
}
