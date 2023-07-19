package sec07.exam01_nonblocking_tcpchannel;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ClientExample extends Application {
	SocketChannel socketChannel;
	
	void startClient() {
		//연결 시작 코드
		Thread thread = new Thread() { //스레드 생성
			@Override
			public void run() {
				try {
					//Socket 생성 및 연결 요청
					socketChannel = SocketChannel.open();
					socketChannel.configureBlocking(true);
					socketChannel.connect(new InetSocketAddress("localhost", 5001));
					
					Platform.runLater(() -> {
						try {
							displayText("[연결 완료: " + socketChannel.getRemoteAddress() + "]");
							btnConn.setText("stop");
							btnSend.setDisable(false);
						} catch (IOException e) {}
					});
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[서버 통신 안됨]"));
					if(socketChannel.isOpen()) { stopClient(); }
					return;
				}
				receive(); //서버에서 보낸 데이터 받기
			}
		};
		thread.start(); //스레드 시작
	}
	
	void stopClient() {
		//연결 끊기 코드
		try {
			Platform.runLater(() -> {
				displayText("[연결 끊음]");
				btnConn.setText("start");
				btnSend.setDisable(true);
			});
			if(socketChannel != null && socketChannel.isOpen()) {
				socketChannel.close(); //연결 끊기
			}
		} catch (Exception e) {}
	}
	
	void receive() {
		//데이터 받기 코드
		while(true) {
			try {
				ByteBuffer byteBuffer = ByteBuffer.allocate(100);
				
				//서버가 비정상적으로 종료했을 경우 IOException 발생
				int readByteCount = socketChannel.read(byteBuffer); //데이터 받기
				
				//서버가 정상적으로 Socket의 close()를 호출했을 경우
				if(readByteCount == -1) {
					throw new IOException();
				}
				
				//문자열로 변환
				byteBuffer.flip();
				Charset charset = Charset.forName("UTF-8");
				String data = charset.decode(byteBuffer).toString();
				
				Platform.runLater(() -> displayText("[받기 완료]" + data));
			} catch (Exception e) {
				Platform.runLater(() -> displayText("[서버 통신 안됨]"));
				stopClient();
				break;
			}
		}
	}
	
	void send(String data) {
		//데이터 전송 코드
		Thread thread = new Thread() { //스레드 생성
			@Override
			public void run() {
				try {
					Charset charset = Charset.forName("UTF-8");
					ByteBuffer byteBuffer = charset.encode(data);
					socketChannel.write(byteBuffer); //서버로 데이터 보내기
					Platform.runLater(() -> displayText("[보내기 완료]"));
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[서버 통신 안됨]"));
					stopClient();
				}
			}
		};
		thread.start(); //스레드 시작
	}
	
	/////////////////////////////////////////
	//UI 생성 코드
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);
		
		BorderPane bottom = new BorderPane();
			txtInput = new TextField();
			txtInput.setPrefSize(60, 30);
			BorderPane.setMargin(txtInput, new Insets(0, 1, 1, 1));
			
			btnConn = new Button("start");
			btnConn.setPrefSize(60, 30);
			
			//start 버튼과 stop 버튼을 클릭했을 때 이벤트 처리
			btnConn.setOnAction(e -> {
				if(btnConn.getText().equals("start")) {
					startClient();
				} else if(btnConn.getText().equals("stop")) {
					stopClient();
				}
			});
			
			btnSend = new Button("send");
			btnSend.setPrefSize(60, 30);
			btnSend.setDisable(true);
			btnSend.setOnAction(e -> send(txtInput.getText())); //send 버튼을 클릭했을 때 이벤트 처리
			
			bottom.setCenter(txtInput);
			bottom.setLeft(btnConn);
			bottom.setRight(btnSend);
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event -> stopClient()); //윈도우 우측 상단 닫기 버튼을 클릭했을 때 이벤트 처리
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
