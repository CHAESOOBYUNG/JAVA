package sec07.exam02_data_read_write;

import java.io.*;
import java.net.*;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); //Socket 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001)); //연결 요청
			System.out.println("[연결 성공]");
			
			byte bytes[] = null;
			String message = null;
			
			//1. client가 먼저 "Hello Server"를 보낸다.
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			//4. client가 3번 데이터를 받는다.
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공]: " + message);
			
			os.close();
			is.close();
			
		} catch (Exception e) {}
		
		if(!socket.isClosed()) { //연결이 되어 있을 경우
			try {
				socket.close(); //연결 끊기
			} catch (IOException e1) {}
		}
	}
}
