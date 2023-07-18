package sec06.exam03_chatting;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.*;
import java.util.concurrent.*;

import javax.sql.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocketChannel serverSocketChannel;
	List<Client> connections = new Vector<Client>();
	
	void startServer() {
		//서버 시작 코드
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		try {
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.configureBlocking(true);
			serverSocketChannel.bind(new InetSocketAddress(5001));
		} catch (Exception e) {
			if(serverSocketChannel.isOpen()) {
				stopServer();
			}
			return;
		}
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(() -> {
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});
				
				while(true) {
					try {
						SocketChannel socketChannel = serverSocketChannel.accept(); //연결 수락
						String message = "[연결 수락: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() +"]";
						Platform.runLater(() -> displayText(message));
						
						//Client 객체 저장
						Client client = new Client(socketChannel);
						connections.add(client);
						
						Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));
					} catch (IOException e) {
						if(serverSocketChannel.isOpen()) {
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
			//모든 SocketChannel 닫기
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socketChannel.close();
				iterator.remove();
			}
			
			//ServerSocketChannel 닫기
			if(serverSocketChannel != null && serverSocketChannel.isOpen()) {
				serverSocketChannel.close();
			}
			
			//ExecutorService 종료
			if(executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (Exception e) {}
		
	}
	
	class Client {
		//데이터 통신 코드
		SocketChannel socketChannel;
		
		Client(SocketChannel socketChannel) {
			this.socketChannel = socketChannel;
			receive();
		}
		
		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					while(true)	{
						try {
							ByteBuffer byteBuffer = ByteBuffer.allocate(100);
							
							//클라이언트가 비정상 종료를 했을 경우 IOException 발생
							int readByteCount = socketChannel.read(byteBuffer); //데이터 받기
							
							//클라이언트가 정상적으로 SocketChannel의 close()를 호출했을 경우
							if(readByteCount == -1) {
								throw new IOException();
							}
							
							String message = "[요청 처리: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName();
							Platform.runLater(() -> displayText(message));
							
							//문자열로 변환
							byteBuffer.flip();
							Charset charset = Charset.forName("UTF-8");
							String data = charset.decode(byteBuffer).toString();
							
							//모든 클라이언트에게 보냄
							for(Client client : connections) {
								client.send(data);
							}
							
						} catch (Exception e) {
							try {
								connections.remove(Client.this);
								String message = "[클라이언트 통신 안됨: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName();
								Platform.runLater(() -> displayText(message));
							} catch (Exception e2) {}
							break;
						}
						
					}
				}
			};
			executorService.submit(runnable); //스레드풀에서 처리
		}
		
		void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						//클라이언트로 보내기
						Charset charset = Charset.forName("UTF-8");
						ByteBuffer byteBuffer = charset.encode(data);
						socketChannel.write(byteBuffer);
					} catch (Exception e) {
						try {
							String message = "[클라이언트 통신 안됨: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName();
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socketChannel.close();
						} catch (Exception e2) {}
					}
				}
			};
			executorService.submit(runnable);
		}
	}
	
	/////////////////////////////////////////
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
		
		//start 버튼과 stop 버튼을 클릭했을 때 이벤트 처리
		btnStartStop.setOnAction(e-> {
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
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer()); //윈도우 우측 상단 닫기 버튼 클릭했을 때 이벤트 처리
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