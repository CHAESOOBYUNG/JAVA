package quiz01;

public class MethodQuiz04 {

	public static void main(String[] args) {
		
		String str = java(5);
		System.out.println(str);
		
		int result = sum(5);
		System.out.println(result);
		
		int result2 = primeNum(10);
		System.out.println(result2);
		
		/*
		 * ㅈ자연수의 자리수 합 구하기
		 * 자연수 n이 매개변수로 주어지면, 각 자리수의 합을 구해서 return하는
		 * 메서드를 만드세요.
		 * 
		 * 조건
		 * n은 1억 이하의 자연수
		 * n을 자료형을 변환해서 연산하지 말것.
		 * 
		 * 123400 -> return 10
		 */
		
		System.out.println(test(123)); //6
		System.out.println(test(0)); //0
		System.out.println(test(100000000)); //1
	}
	
	//1
	static String java(int a) {
		String str = "";
		
		for(int i = 1; i <= a; i++) {
			str = i % 2 == 1 ? (str+="자") : (str+="바");
		}
		return str;
	}
	//2
	static int sum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) sum += i;
		}
		return sum;
	}
	//3
	static int primeNum(int a) {
		int cnt = 0; //소수의개수
		for(int i = 1; i <= a; i++) {
			
			int count = 0; //약수의 개수
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) count++;
				
			} //end inner
			if(count == 2) cnt++;
		}
		return cnt;
	}
	//4
	static int test(int a) {
		int sum = 0;
		for(int i = 100000000; i >= 1; i/=10) {
			if(a / i != 0) {
				sum += (a / i);
				a %= i;
			}
		}
		return sum;
	}
	
	
	
	
	
}
