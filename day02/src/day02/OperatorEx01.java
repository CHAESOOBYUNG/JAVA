package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		//단항연산자
		//부호연산자 +, -
		int i = -3;
		int j = -i;
		System.out.println(j); //3
		
		//증감연산자 ++, --
		int k = 1;
		int h = k++; //후위연산 - 먼저값을 대입하고, 자신을 증가
		
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
		
		int x = 1;
		int y = ++x; //전위연산 - 먼저 증가하고, 값을 대입
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		//일반적인 표현형식
		x = 1;
		++x; //2
		x++; //3
		
		System.out.println("------------------------");
		x = 1;
		System.out.println(x++); //1
		System.out.println(++x); //3
		
		//주의할 점
		x = 10;
		y = 10;
		int result = (x++) + (x++) + 10;
		System.out.println(result);
		
		System.out.println("-------------------------------");
		
		//비트반전연산자 ~
		byte b = 10; //0000_1010
		System.out.println(~b); //2진수를 반대로 -> 1111_0101
		System.out.println(~b + 1);
		
		System.out.println("-------------------------------");
		
		//논리반전 연산자 !
		System.out.println(!true); //f
		System.out.println(!false); //t
		
		boolean bool = !true;
		System.out.println(bool);
		
		
		
		
		
	}
}
