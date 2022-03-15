package api.lang.system;

public class SystemEx {

	public static void main(String[] args) {
		
		//system클래스는 운영체제의 속성정보를 읽는데 사용할 수있습니다.
		//system클래스는 전부 static메서드로 사용합니다.
		
		//1970년 1월 1일 자정~ 현재까지 경과시간을 밀리초로 반환
		long start = System.currentTimeMillis();
	
		//측정할 시간
		long sum = 0;
		for(long i = 1; i < 1000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간:" + (end - start) * 0.001  );
		
		System.gc(); //가비지컬렉터 실행(메모리정리)
		System.exit(0); //프로그램 종료
		
		
	}
}
