package single_server;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(8383);
			
			System.out.println("----연결 대기중----");
			Socket clientSocket = serverSocket.accept();
			
			//Receive클래스에 역할 분담
			//메시지 받기
			Receive receive = new Receive(clientSocket);
			
			//메시지 보내기
			Sender sender = new Sender(clientSocket);
			
			
			receive.start();
			sender.start();
			
			
		} catch (Exception e) {
			System.out.println("메인서버에러");
			e.printStackTrace();
		}
		
		
		
		
	}
}
