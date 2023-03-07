package sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		// System.out.println("배열의 길이: " + args.length);
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayExample num1 num2");
			System.exit(0); // 프로그램 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //정수로 타입 변환
		int num2 = Integer.parseInt(strNum2); 
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}
	
	/* eclipse에서 실행
	   play버튼 창 아래 화살표 -> Run Configurations... -> Arguments 
	   -> Program Arguments 아래 테이블에 값을 입력
	*/
	
	/* cmd에서 실행
	   C:\Users\Chae Soobyung>cd //1
	   C:\Users\Chae Soobyung\Desktop\course\Java\workspace\chap05\bin
	   
	   C:\Users\Chae Soobyung\Desktop\course\Java\workspace\chap05\bin>dir //2
	   C 드라이브의 볼륨에는 이름이 없습니다. 볼륨 일련 번호: 5641-0B56
	  
	   C:\Users\Chae Soobyung\Desktop\course\Java\workspace\chap05\bin 디렉터리
	   
	   2023-02-20 오후 04:22 <DIR> . 2023-02-20 오후 04:22 <DIR> .. 2023-02-20 오후 02:12
	   <DIR> sec05 2023-02-21 오전 09:29 <DIR> sec06 0개 파일 0 바이트 4개 디렉터리
	   31,882,313,728 바이트 남음
	  
	   C:\Users\Chae Soobyung\Desktop\course\Java\workspace\chap05\bin>java sec06.exam04_main_argument.MainStringArrayExample //3
	   배열의 길이: 0
	   
	   C:\Users\Chae Soobyung\Desktop\course\Java\workspace\chap05\bin>java sec06.exam04_main_argument.MainStringArrayExample abc def //4 
	   배열의 길이: 2
	   
	   C:\Users\Chae Soobyung\Desktop\course\Java\workspace\chap05\bin>java sec06.exam04_main_argument.MainStringArrayExample 자바 프로그램 //5
	   배열의 길이: 2
	 */
}
