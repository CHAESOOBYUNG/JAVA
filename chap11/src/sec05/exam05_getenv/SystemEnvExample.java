package sec05.exam05_getenv;

public class SystemEnvExample {
	/* 환경변수 설정
	 * 고급시스템 설정 -> 환경변수 -> 설정 가능
	 * 
	 * 제어판 -> 시스템 및 보안 -> 시스템 -> 시스템 보호
	 * -> 고급 -> 환경변수 -> 변수 TEMP -> 시스템 변수 -> 새로 만들기
	 * -> JAVA_HOME -> C:\JavaProgramming\jdk1.8.0_20
	 */
	
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME] " + javaHome);
	}
}
