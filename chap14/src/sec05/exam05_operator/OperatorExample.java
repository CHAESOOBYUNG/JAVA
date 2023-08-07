package sec05.exam05_operator;

import java.util.function.*;

public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) { //2개의 int 연산
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score); //람다식{} 실행
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
			//람다식 (큰값 리턴)
			(a, b) -> {
				if(a >= b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			//람다식 (작은 값 리턴)
			(a, b) -> {
				if(a <= b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}
}
