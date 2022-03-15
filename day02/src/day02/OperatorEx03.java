package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 소괄호가 true라면 if문을 실행, false라면 else문을 실행
		if( x != 10 && ++y == 21 ) {
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
				
		
		
		
		if(x == 10 || ++y == 21 ) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
			
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		
		
		
		
		
		
	}
}
