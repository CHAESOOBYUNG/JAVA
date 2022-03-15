package overloading.basic;

public class Basic {

	//오버로딩 - 같은 이름의 메서드를 여러개 만드는 것. (매개변수를 다르게 해서)
	
	void input(int i) {
		System.out.println("정수 1개 입력받음");
	}
	//반환유형은 영향을 미치지 않음.
//	int input(int a) {
//	}
	void input(String s) {
		System.out.println("문자열 1개 입력받음");
	}
	
	void input(String s, double d) {
		System.out.println("문자열 1개, 실수형 1개 입력 받음");
	}
	
	void input(double d, String s) {
		System.out.println("실수형 1개, 문자열 1개 입력 받음");
	}
	
	void input(char c, int i, double d) {
		System.out.println("문자, 정수, 실수 1개 입력받음.");
	}
	
}
