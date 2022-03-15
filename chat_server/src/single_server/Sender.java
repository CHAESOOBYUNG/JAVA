package single_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {

	//메시지를 클라이언트로 전송역할
	private Socket socket;
	
	public Sender(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
	
		//Scanner scan = new Scanner(System.in);
		//String message = scan.nextLine();
		
		try {
			//키보드로 부터의 입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in , "UTF-8"));

			//연결된 소켓에 아웃풋 스트림을 이용해서 데이터 전달( 연결된 소켓으로의 출력)
			PrintWriter out = new PrintWriter( socket.getOutputStream() );
			
			while(true) {
				
				System.out.print(">");
				String message = br.readLine(); //키보드로부터의 입력
				out.println(message); //소켓(클라이언트)으로의 전송
				out.flush(); //데이터를 밀어낸다.
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
