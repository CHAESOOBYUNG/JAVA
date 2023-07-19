package sec07.exam01_nonblocking_tcpchannel;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.channels.Selector;
import java.nio.charset.*;
import java.util.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ServerExample extends Application {
	Selector selector;
	ServerSocketChannel serverSocketChannel;
	List<Client> connections = new Vector<Client>();
	
	void startServer() {
		//서버 시작 코드
		try {
			selector = Selector.open();
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.configureBlocking(false);
			serverSocketChannel.bind(new InetSocketAddress(5001));
			serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		} catch (IOException e) {
			if(serverSocketChannel.isOpen()) {
				stopServer();
			}
			return;
		}
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				while(true) {
					int keyCount;
					try {
						keyCount = selector.select();
						if(keyCount == 0) { continue; }
						Set<SelectionKey> selectionKeys = selector.selectedKeys();
						Iterator<SelectionKey> iterator = selectionKeys.iterator();
						while(iterator.hasNext()) {
							SelectionKey selectionKey = iterator.next();
							if(selectionKey.isAcceptable()) {
								accept(selectionKey);
							} else if(selectionKey.isReadable()) {
								Client client = (Client) selectionKey.attachment();
								client.receive(selectionKey);
							} else if(selectionKey.isWritable()) {
								Client client = (Client) selectionKey.attachment();
								client.send(selectionKey);
							}
							iterator.remove();
						}
					} catch (IOException e) {
						if(serverSocketChannel.isOpen()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		thread.start();
		
		Platform.runLater(() -> {
			displayText("[서버 시작]");
			btnStartStop.setText("stop");
		});
	}
	
	void stopServer() {
		//서버 종료 코드
		try {
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socketChannel.close();
				iterator.remove();
			}
			
			if(serverSocketChannel != null && serverSocketChannel.isOpen()) {
				serverSocketChannel.close();
			}
			
			if(selector != null && selector.isOpen()) {
				selector.close();
			}
			
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (Exception e) {
			
		}
	}
	
	void accept(SelectionKey selectionKey) {
		//연결 수락 코드
		try {
			ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
			SocketChannel socketChannel = serverSocketChannel.accept();
			
			String message = "[연결 수락: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() +"]";
			Platform.runLater(() -> displayText(message));
			
			Client client = new Client(socketChannel);
			connections.add(client);
			
			Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));
		} catch (Exception e) {
			if(serverSocketChannel.isOpen()) {
				stopServer();
			}
		}
	}
	
	class Client {
		//데이터 통신 코드
		SocketChannel socketChannel;
		String sendData;
		
		Client(SocketChannel socketChannel) throws IOException {
			this.socketChannel = socketChannel;
			socketChannel.configureBlocking(false);
			SelectionKey selectionKey = socketChannel.register(selector, SelectionKey.OP_READ);
			selectionKey.attach(this);
		}
		
		void receive(SelectionKey selectionKey) {
			try {
				ByteBuffer byteBuffer = ByteBuffer.allocate(100);
				
				int byteCount = socketChannel.read(byteBuffer);
				
				if(byteCount == -1) {
					throw new IOException();
				}
				
				String message = "[요청 처리: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() + "]";
				Platform.runLater(() -> displayText(message));
				
				byteBuffer.flip();
				Charset charset = Charset.forName("UTF-8");
				String data = charset.decode(byteBuffer).toString();
				
				for(Client client : connections) {
					client.sendData = data;
					SelectionKey key = client.socketChannel.keyFor(selector);
					key.interestOps(SelectionKey.OP_WRITE);
				}
				selector.wakeup();
				
			} catch (Exception e) {
				try {
					connections.remove(this);
					String message = "[클라이언트 통신 안됨: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() + "]";;
					Platform.runLater(() -> displayText(message));
					socketChannel.close();
				} catch (Exception e2) {}
			}
			
		}
		
		void send(SelectionKey selectionKey) {
			try {
				Charset charset = Charset.forName("UTF-8");
				ByteBuffer byteBuffer = charset.encode(sendData);
				socketChannel.write(byteBuffer);
				selectionKey.interestOps(SelectionKey.OP_READ);
				selector.wakeup();
			} catch (Exception e) {
				try {
					connections.remove(this);
					String message = "[클라이언트 통신 안됨: " + socketChannel.getRemoteAddress() + ": " + Thread.currentThread().getName() + "]";;
					Platform.runLater(() -> displayText(message));
					socketChannel.close();
				} catch (Exception e2) {}
			}
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
