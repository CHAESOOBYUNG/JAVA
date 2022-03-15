package basic_server;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		
		//자바 net패키지는 네트워크 통신에 사용되는 기능이 들어있는 패키지
		//try~catch문 안에서 모든 코드 작성합니다.
		
		try {
			//192.132.30.1~~ 192.132.30.255:포트
			//accept는 클라이언트 접속하기 까지 대기상태로 있다가,
			//클라이언트가 접속되면 클라이언트에 대한 정보를 소켓에 넣어서 반환.
			ServerSocket serverSocket = new ServerSocket(8383);
			
			System.out.println("------연결대기------");
			Socket socket = serverSocket.accept();
			
			//클라이언트 측의 접속된 곳으로 데이터를 output
			OutputStream os = socket.getOutputStream();
			
			//보낼메시지
			String message = "클라이언트야 환영해!";
			
			//클라이언트 측으로의 전송
			os.write( message.getBytes() ); 
			
			//소켓해제
			os.close();
			serverSocket.close();
			
			System.out.println("-----서버 종료-----");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
}
