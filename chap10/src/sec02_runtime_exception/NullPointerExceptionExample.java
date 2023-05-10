package sec02_runtime_exception;

public class NullPointerExceptionExample {
	/* Excepotion 종류 + 설명
	 * https://docs.oracle.com/javase/8/docs/api/index.html 
	 * 왼쪽 하단 창 -> Exception, RuntimeException 참고
	 */
	
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}
}
