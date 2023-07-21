package sec09.exam01_udp;

import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class UdpSendExample {
	public static void main(String[] args) throws Exception{
		DatagramChannel datagramChannel = DatagramChannel.open(StandardProtocolFamily.INET);
		
		System.out.println("[발신 시작]");
		
		for(int i = 1; i <=3; i++) {
			String data = "메시지" + i;
			Charset charset = Charset.forName("UTF-8");
			ByteBuffer byteBuffer = charset.encode(data);
			
			//데이터 보내기
			int byteCount = datagramChannel.send(byteBuffer, new InetSocketAddress("localhost", 5001));
			
			System.out.println("[보낸 바이트 수] " + byteCount + " bytes");		
		}
		
		System.out.println("[발신 종료]");
		datagramChannel.close();
		
	}
}
