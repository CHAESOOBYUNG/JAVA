package sec03.exam01_system_in_out;

import java.io.*;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		for(byte b = 48; b < 58; b++) {
			os.write(b); // 아스키 코드 48~57 문자 출력(0~9)
		}
		
		os.write(13); // 라인피드(10, 13)을 출력하면 다음 행으로 넘어간다.
		
		for(byte b = 97;  b < 123; b++) {
			os.write(b); // 아스키 코드 97~122 문자 출력(a~z)
		}
		
		os.write(10); // 라인피드(10, 13)을 출력하면 다음 행으로 넘어간다.
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}
}
