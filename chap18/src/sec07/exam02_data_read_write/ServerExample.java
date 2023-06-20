package sec07.exam02_data_read_write;

import java.io.*;
import java.net.*;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); //ServerSocket 생성
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); //클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				byte bytes[] = null;
				String message = null;
				
				//2. 서버가 1번 데이터("Hello Server")를 받고
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");		
				System.out.println("[데이터 받기 성공]: " + message);
				
				//3. "Hello Client"를 클라이언트로 보낸다.
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(!serverSocket.isClosed()) { //ServerSocket이 닫혀있지 않을 경우
			try {
				serverSocket.close(); //ServerSocket 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
