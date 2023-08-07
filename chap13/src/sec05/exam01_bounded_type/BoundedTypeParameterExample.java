package sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// int result1 = Util.compare("a", "b"); - X / compare 함수에서 타입은 숫자만 가능 (Number 상속)
		//String은 Number 타입이 아님
		
		int result1 = Util.compare(10, 20); //int -> Integer (자동 Boxing)
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); //double -> Double (자동 Boxing)
		System.out.println(result2);
	}
}
