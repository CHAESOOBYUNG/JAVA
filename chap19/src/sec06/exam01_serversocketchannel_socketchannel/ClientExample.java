package sec06.exam01_serversocketchannel_socketchannel;

import java.io.*;
import java.net.*;
import java.nio.channels.*;

public class ClientExample {
	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("[연결 요청]");
			socketChannel.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(socketChannel.isOpen()) {
			try {
				socketChannel.close();
			} catch (IOException e) {}
		}
		
	}
}
