package sec07.exam01_serversocket_socket;

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
