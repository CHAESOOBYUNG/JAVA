package sec06.exam01_inetaddress;

import java.net.*;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = Inet4Address.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.google.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.google.com IP주소: " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
