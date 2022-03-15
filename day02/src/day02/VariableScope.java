package day02;

public class VariableScope {

	public static void main(String[] args) {
		
		//int num1 = 10;
		//int num2 = 20;
		
		//c언어 스타일
		int num1 = 10, num2 = 20;
		int num4 = 20;
		
		if(true) {
			int num3 = 100;
			num4 = num1; //변경
			num4 = 200;
		
		}
		
		int num3 = 200;
		System.out.println(num3);
		
		System.out.println(num4); //200 
		
		
		
		
	}
}
