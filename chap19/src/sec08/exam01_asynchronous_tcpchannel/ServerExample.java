package sec08.exam01_asynchronous_tcpchannel;

import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.*;
import java.util.concurrent.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ServerExample extends Application {
	AsynchronousChannelGroup channelGroup;
	AsynchronousServerSocketChannel serverSocketChannel;
	List<Client> connections = new Vector<Client>();
	
	void startServer() {
		//서버 시작 코드
		try {
			channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
				Runtime.getRuntime().availableProcessors(),
				Executors.defaultThreadFactory()
			);
			
			serverSocketChannel = AsynchronousServerSocketChannel.open(channelGroup);
			serverSocketChannel.bind(new InetSocketAddress(5001));
		} catch (Exception e) {
			if(serverSocketChannel.isOpen()) {
				stopServer();
			}
			return;
		}
		
		Platform.runLater(() -> {
			displayText("[서버 시작]");
			btnStartStop.setText("stop");
		});
		
		serverSocketChannel.accept(null,
			new CompletionHandler<AsynchronousSocketChannel, Void>() {
				@Override
				public void completed(AsynchronousSocketChannel socketChannel, Void attachment) {
					String message;
					try {
						message = "[연결 수락: " +	socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));
					} catch (Exception e) {}
					
					//Client 객체 저장
					Client client = new Client(socketChannel);
					connections.add(client);
					
					Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));
					
					serverSocketChannel.accept(null, this); //accept() 다시 호출
				}

				@Override
				public void failed(Throwable exc, Void attachment) {
					if(serverSocketChannel.isOpen()) {
						stopServer();
					}
				}
			}); //accept() 메소드 끝
	} //startServer() 메소드 끝
	
	void stopServer() {
		//서버 종료 코드
		try {
			connections.clear();
			if(channelGroup != null && channelGroup.isShutdown()) {
				channelGroup.shutdownNow(); //비동기 채널 그룹 종료(모든 비동기 채널이 닫힘)
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (Exception e) {
		}
	}
	
	class Client {
		//데이터 통신 코드
		AsynchronousSocketChannel socketChannel;
		
		Client(AsynchronousSocketChannel socketChannel) {
			this.socketChannel = socketChannel;
			receive();
		}
		
		void receive() {
			ByteBuffer byteBuffer = ByteBuffer.allocate(100);
			socketChannel.read(byteBuffer, byteBuffer, 
				new CompletionHandler<Integer, ByteBuffer>() {

					@Override
					public void completed(Integer result, ByteBuffer attachment) {
						try {
							String message = "[요청 처리: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							
							//문자열 변환
							attachment.flip();
							Charset charset = Charset.forName("UTF-8");
							String data = charset.decode(attachment).toString();
							
							//모든 클라이언트에게 보내기
							for(Client client : connections) {
								client.send(data);
							}
							
							ByteBuffer byteBuffer = ByteBuffer.allocate(100);
							socketChannel.read(byteBuffer, byteBuffer, this); //다시 데이터 읽기
						} catch (Exception e) {}
					}

					@Override
					public void failed(Throwable exc, ByteBuffer attachment) {
						try {
							String message = "[클라이언트 통신 안됨: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() +"]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socketChannel.close();
						} catch (Exception e) {}
					}
				}
			);
		}
		
		void send(String data) {
			Charset charset = Charset.forName("UTF-8");
			ByteBuffer byteBuffer = charset.encode(data);
			socketChannel.write(byteBuffer, null, 
				new CompletionHandler<Integer, Void>() {
					@Override
					public void completed(Integer result, Void attachment) {
					}

					@Override
					public void failed(Throwable exc, Void attachment) {
						try {
							String message = "[클라이언트 통신 안됨: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() +"]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socketChannel.close();
						} catch (Exception e) {}
					}
				
				}
			);
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
