package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a = 5;
		
		//문자or정수 형태의 변수나 변수의 연산식이 들어갈 수 있습니다.
		switch(a) {
		
		case 0:
		case 1:
			System.out.println("1입니다");
			break; //스위치 문장을 빠져나온다
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
			
		default :
			System.out.println("1~4이외의 숫자 입니다");
			break;
		}
		
		
		
		
		
		
	}
}
