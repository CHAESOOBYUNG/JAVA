package single_server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread {

	//메시지를 받는역할
	private Socket socket;
	
	public Receive(Socket socket ) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			//클라이언트 측에서 전송된 데이터를 받는다. (클라이언트 측에서 전송된 메시지는 socket안에 inputStream에 저장됨)
			InputStream is = socket.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader( is , "UTF-8"));
			
			while(true) {
				String message = br.readLine();
				
				if(message == null) {
					System.out.println("연결종료(상대방이 나갔습니다)");
					break;
				} else {
					System.out.println("상대방:" + message);
				}
			}
			
			is.close();
			br.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
