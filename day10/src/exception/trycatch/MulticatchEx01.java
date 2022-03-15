package exception.trycatch;

public class MulticatchEx01 {

	public static void main(String[] args) {
		
		/*
		 * main에 값을 전달하는 방법
		 * 
		 * run -> run configuration -> argments탭 -> ${string_prompt}
		 */
		
		try {
			
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1); //문자열을 정수로 변경 ( )
			int num2 = Integer.parseInt(data2);
			
			System.out.println("두 수의 합:" + (num1 + num2) );
			
			String str = null;
			str.charAt(0); 
			
			
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { //다중캐치문을 사용할때 정확한 예외 종류가 ()에 들어갑니다.
			System.out.println("실행 매개값은 반드시 2개 입력하세요");
			
		} catch (Exception e) { //예외의 부모클래스이기 떄문에 모든 실행예외의 처리가 가능
			System.out.println("기타 예외 입니다");
		}
		
		
		
		
		
		
		
	}
}
