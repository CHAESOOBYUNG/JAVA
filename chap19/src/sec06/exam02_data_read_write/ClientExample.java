package sec06.exam02_data_read_write;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class ClientExample {
	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("[연결 요청]");
			socketChannel.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			
			ByteBuffer byteBuffer = null;
			Charset charset = Charset.forName("UTF-8");
			
			byteBuffer = charset.encode("Hello Server");
			socketChannel.write(byteBuffer);
			System.out.println("[데이터 보내기 성공]");
			
			byteBuffer = ByteBuffer.allocate(100);
			int byteCount = socketChannel.read(byteBuffer);
			byteBuffer.flip();
			String message = charset.decode(byteBuffer).toString();
			System.out.println("[데이터 받기 성공]");
			
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
