package inter;

public class Test implements ITest{

	private String url = "xxxxx.xxxxx.com";
	
	@Override
	public void select(String s) {
		
		System.out.println(url);
		System.out.println(s);
	}

	@Override
	public void insert(int a) {
		
		System.out.println(url);
		System.out.println(a);
		
	}

	@Override
	public void delete(int i) {
		System.out.println(url);
		System.out.println(i);
		
	}

	
}
