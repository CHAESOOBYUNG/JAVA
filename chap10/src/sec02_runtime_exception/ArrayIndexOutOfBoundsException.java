package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		/* Run -> Run configurations... -> arguments -> Program arguments -> 홍길동 30 -> 입력 
		 * 결과값 - args[0]:홍길동
		 *		  args[1]:30
		 * -> 홍길동 -> 입력
		 * 결과값 - ArrayIndexOutOfBoundsException 발생
		 * 
		 */
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println(" 값1 값2");
		}
		
	}
}
