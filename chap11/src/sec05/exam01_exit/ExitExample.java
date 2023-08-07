package sec05.exam01_exit;

public class ExitExample {
	public static void main(String[] args) {
		//현재 버전에서 제공하지 않는 기능
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i = 0; i < 10; i++) {
			//i값 출력
			System.out.println(i);
			
			try {
				//JVM 종료 요청
				System.exit(i);
			} catch (SecurityException e) {}
			
		}
	}
	
	//결과값
	//0
	//1
	//2
	//3
	//4
	//5
}
