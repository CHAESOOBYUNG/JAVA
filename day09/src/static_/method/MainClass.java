package static_.method;

import java.util.Arrays;

public class MainClass {


	public static void main(String[] args) {
		
		Count.b++;
		Count.method02();
		
		
		Count c = new Count();
		c.a++;
		c.method01();
		
		//b? 3
		
		//static메서드의 예시
//		Math.random();
//		Arrays.toString();
//		Integer.parseInt("1");
//		String.valueOf(false);
		
//		MainClass m = new MainClass();
//		m.test();		
		
	}
	
	public  void test() {
		
	}
	
	
	
	
}
