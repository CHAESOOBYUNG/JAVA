package exception.trycatch;

public class TrycatchEx02 {

	public static void main(String[] args) {
		
		//반복문에서 예외처리
		String[] names = {"홍길동", "이순신", "신사임당" };
		
		int i = 0;
		while(i < 4) {
			
			try {
				
				System.out.println(names[i]);
			} catch (Exception e) {
				System.out.println("배열의 참조를 벗어났습니다.");
			} finally { //에러 발생 여부와 관계없이 무조건 실행
				System.out.println("반드시 실행"); 
			}
			
			i++;
		}
		

		System.out.println("프로그램 정상 종료");
		
		
		
	}
}
