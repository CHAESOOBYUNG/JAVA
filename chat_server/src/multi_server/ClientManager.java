package multi_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManager extends Thread{

	private Socket socket;
	private String id;
	
	public ClientManager(Socket socket) {
		this.socket= socket;
	}

	//쓰레드의 run메서드 오버라이드
	@Override
	public void run() {
		
		try {
			//소켓클래스로부터 전달된 input을 받는다.
			BufferedReader br = new BufferedReader( new InputStreamReader( socket.getInputStream() , "UTF-8"));
			
			while(true) {
				
				String message = br.readLine(); //소켓으로부터 전달된 message
				
				//1. socket연결이 끊어진 경우.
				if(message == null) {
					System.out.println("서버로그:" + id + "님이 퇴장하였습니다");
					//1-2. 연결된 모든 소켓에 퇴장메시지를 전달
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter out = MainServer.list.get(i);
						
						out.println(id + "님이 퇴장하였습니다");
						out.flush(); //flush로 송신
					}
					//1-3. 현재 쓰레드를 종료하기 위해 while탈출
					break;
					
				}
				
				//2. socket이 연결된 경우.
				String[] split = message.split(":");
				if(split.length == 2 && split[0].equals("ID")) {
					this.id = split[1]; //아이디형식이 ID:abc로 전달되므로 :기준 뒤에 값을 저장
					
					System.out.println("서버로그:" + this.id + "님이 입장하였습니다");
					
					for(int i =0; i < MainServer.list.size(); i++) {
						PrintWriter out = MainServer.list.get(i);
						
						out.println( id + "님이 입장했습니다");
						out.flush();
					}
					
					continue; //처음으로 돌아가서 다음 메세지의 대기상태를 기다림.
					
				} //end if
				
				
				//3. 일반 메시지 전달된 경우.
				for(int i = 0; i < MainServer.list.size(); i++) {
					PrintWriter out = MainServer.list.get(i);
					out.println( id + ">" + message);
					out.flush();
				}
				
				//서버에 올라오는 msg
				System.out.println("서버로그:" + id + ">" + message);
				
				
			} //end while
			
			//종료되는 시점에서 list에 새당 소켓을 삭제하고 소켓을 닫는다.
			MainServer.list.remove( new PrintWriter(socket.getOutputStream()));
			
		} catch (Exception e) {
			System.out.println(this.id + "님 연결이 끊겼습니다");
		}
		
		
		
		
		
		
	}
	
	
	
	
}
