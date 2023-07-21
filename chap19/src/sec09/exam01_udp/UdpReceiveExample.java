package sec09.exam01_udp;

import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class UdpReceiveExample {
	public static void main(String[] args) throws Exception {
		DatagramChannel datagramChannel = DatagramChannel.open(StandardProtocolFamily.INET);
		datagramChannel.bind(new InetSocketAddress(5001));
		
		Thread thread = new Thread() { //스레드 생성
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while(true) {
						ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
						SocketAddress socketAddress = datagramChannel.receive(byteBuffer); //데이터 받기
						
						byteBuffer.flip();
						Charset charset = Charset.forName("UTF-8");
						String data = charset.decode(byteBuffer).toString();
						System.out.println("[받은 내용: " + socketAddress.toString() + "] " + data);
					}
				} catch (Exception e) {
					System.out.println("[수신 종료]");
				}
			}
		};
		thread.start(); //스레드 시작
		
		Thread.sleep(10000);
		datagramChannel.close();
	}
}
