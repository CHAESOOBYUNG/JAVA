package inter;

public class MainClass {

	public static void main(String[] args) {
		
	//실행시킬 클레스
	ITest t = new Test();
	t.insert(1);
	t.select("hello");
	t.delete(2);
	
	
	}
}
