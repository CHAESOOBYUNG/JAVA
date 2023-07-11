package sec07.exam03_chatting;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	
	void startServer() {
		//서버 시작 코드
		executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if(!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}
		
		Runnable runnable = new Runnable() { //수락 작업 생성
			@Override
			public void run() {
				Platform.runLater(()-> {
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});
				
				while(true) {
					try {
						Socket socket = serverSocket.accept(); //연결 수락
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
						Platform.runLater(() -> {
							displayText(message);
						});
						
						//Client 객체 저장
						Client client = new Client(socket);		
						connections.add(client);
						
						Platform.runLater(() -> {
							displayText("[연결 개수: " + connections.size() + "]");
						});
					} catch (IOException e) {	
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
 			}
		};
		
		executorService.submit(runnable); //스레드풀에서 처리
	} //startServer() 메소드 끝
	
	void stopServer() {
		//서버 종료 코드
		try {
			//모든 Socket 닫기
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			//ServerSocket 닫기
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			//ExecutorService 종료
			if(executorService!=null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch(Exception e) {}
	}
	
	class Client {
		//데이터 통신 코드
		Socket socket;
		Client(Socket socket) {
			this.socket = socket;
			receive();
		}
		
		void receive() {
			Runnable runnable = new Runnable() { //받기 작업 생성
				@Override
				public void run() {
					try {
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							int readByteCount = inputStream.read(byteArr); //데이터 받기
							if(readByteCount == -1) {
								throw new IOException();
							}
							
							String message = "[요청 처리: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							
							String data = new String(byteArr, 0, readByteCount, "UTF-8"); //문자열로 변환
							
							//모든 클라이언트에게 보냄
							for(Client client : connections) {
								client.send(data);
							}
						}
					} catch(Exception e) {
						try {
							connections.remove(Client.this);
							String message= "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							socket.close();
						} catch (IOException e1) {}
					}
				}
			};
			executorService.submit(runnable); //스레드풀에서 처리
		}
		
		void send(String data) {
			//데이터 전송 코드
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (Exception e) {
						try {
							String message= "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e1) {}
					}
				}
			};
			executorService.submit(runnable);
		}
	}
	
	///////////////////////////////////////
	//UI 생성 코드
	TextArea txtDisplay;
	Button btnStartStop;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		
		//start와 stop 버튼을 클릭했을 때 이벤트 처리 코드
		btnStartStop.setOnAction(e ->{
			if(btnStartStop.getText().equals("start")) {
				startServer();
			} else if(btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		}); 
		root.setBottom(btnStartStop);
	
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(event -> stopServer()); //윈도우 우측 상단 닫기 버튼을 클릭했을 때 이벤트 처리코드
		primaryStage.show();
	}
	
	//작업 스레드의 작업 처리 내용을 출력할 때 호출하는 메소드
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
