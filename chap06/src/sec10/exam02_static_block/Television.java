package sec10.exam02_static_block;

public class Television {
	static String company = "apple";
	static String model = "apple TV 4k";
	static String info;
	
	static int from1To10Sum;
	
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		from1To10Sum = sum;
		 
	}
}
