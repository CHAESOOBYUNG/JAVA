package ramda.basic;

public class Person {

	//말하기
	public void greeting(Say01 say) {
		say.talking();
	}
	
	//말하기2
	public void greeting(Say02 say) {
		String s = say.talking();
		System.out.println("person인사법:" + s);
	}
	
	//말하기3
	public void greeting(Say03 say) {
		String s = say.talking("니하오");
		System.out.println("person인사법:" + s);
	}
	
	//말하기4
	public String greeting(Say04 say) {
		String s = say.talking(3, "hello");
		return s;
	}
	
	
	
	
	
	
}
