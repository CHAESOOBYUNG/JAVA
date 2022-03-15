package generic.multi;

public class MainClass {

	public static void main(String[] args) {
		
		Basic<Integer, String> basic = new Basic<>();
		
		basic.put(1, "홍길동");
		
	    String name = basic.get(1);	
	    System.out.println(name);
	    
	    System.out.println(basic.toString());
	}
}
