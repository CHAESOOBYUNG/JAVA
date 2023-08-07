package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) { //메소드 1
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { //메소드 2
		double sum = plus(x, y); //메소드 1 호출
		double avg = sum / 2;
		return avg;
	}
	
	void execute() { //메소드 3
		double result = avg(7, 10); //메소드 2 호출
		println("실행결과: " + result); //메소드 4 호출
	}
	
	void println(String message) { //메소드 4
		System.out.println(message);
	}
}
