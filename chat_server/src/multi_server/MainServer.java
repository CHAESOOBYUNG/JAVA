package multi_server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MainServer {

	//서버에 저장하는 클라이언트의 output을 저장하는 리스트
	public static List<PrintWriter> list = new ArrayList<>();
	
	public static void main(String[] args) {
		/*
		 * 채팅은 클라이언트와 클라이언트의 대화입니다.
		 * 즉, 서버는 클라이언트의 채팅글만 전달하고, 채팅에 참여하지는 않습니다.
		 * 그래서 서버는 여러 클라이언트를 서로 연결할 수 있게 하고,
		 * 그 내용을 각각 클라이언트에게 전달하도록 만듭니다.
		 */
	
	try {
		ServerSocket serverSocket = new ServerSocket(8383); //
		
		//접속이 이루어지면, 종료되는 형태가 아니고, 다음 접속을 받을 수 있도록 처러
		while(true) {
			
			System.out.println("----연결 대기----");
			Socket socket = serverSocket.accept();
			
			System.out.println("----연결 됨----");
			//요청이 들어오면 클라이언트 관리클래스를 생성하고, 연결된 소켓의 output정보를 리스트에 저장.
			ClientManager manager = new ClientManager(socket);
			
			//list에는 연결된 사람의 아웃풋정보를 PW객체에 담아 저장.
			list.add( new PrintWriter(socket.getOutputStream()));
			
			//쓰레드시작
			manager.start(); 
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
   
	
	
	
	
	
	}
}


