package 복습2;

public class Ex01 {

	public static void main(String[] args) {
		
		//static키워드의 특징 - 객체생성없이 바로 호출할 수 있다.
		Ex01.method(0, null);
		
		Ex02 e = new Ex02();

		method(1,"S");
		
		Ex06 e1 = new Ex06();
		Inter1 e2 = new Ex06();
		
	}
	
	//접근제어자 반환유형 이름(매개변수) { }
	public static int method(int a, String s) {
		
		return 0;
	}
	
}
