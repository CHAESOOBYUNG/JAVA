package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	
	public static void main(String[] args) {
		// Run -> Run configurations... -> arguments -> Program arguments - 값 입력
		String data1 = null;
		String data2 = null;
		
		try {
		    data1 = args[0]; // ArrayIndexOutOfBoundsException 발생 가능
			data2 = args[1]; // ArrayIndexOutOfBoundsException 발생 가능
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return; // 메소드 종료
		} 
		
		try {
			int value1 = Integer.parseInt(data1); // 문자값 입력 -> NumberFormatException 발생 가능
			int value2 = Integer.parseInt(data2); // 문자값 입력 -> NumberFormatException 발생 가능
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행해주세요.");
		}
	}
	
}
