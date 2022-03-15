package day02;

public class OperatorCondition {

	public static void main(String[] args) {
		
		//랜덤수 -> 0.0이상~1.0미만 double값을 발생
//		System.out.println(  Math.random()  );
		
		//1~10까지 정수
//		double d = Math.random() * 10; //0~9.xxx
//		int r = (int)d + 1; //1~10
//		System.out.println(r);
		
		//한번에 쓰면?
		int result = (int)(Math.random() * 10) + 1;
		System.out.println(result);
		
		
		
		//3항 연산식 (조건 ? 연산1 : 연산2 )
		String s = result >= 5 ? "5보다 큰 수 입니다" : "5보다 작은 수 입니다";
		System.out.println();
		
		
		
		
		
	}
}
