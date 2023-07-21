package sec08.exam01_asynchronous_tcpchannel;

import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.concurrent.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ClientExample extends Application {
	AsynchronousChannelGroup channelGroup;
	AsynchronousSocketChannel socketChannel;
	
	void startClient() {
		//연결 시작 코드
		try {
			channelGroup = AsynchronousChannelGroup.withFixedThreadPool(
				Runtime.getRuntime().availableProcessors(), 
				Executors.defaultThreadFactory()
			);
			
			socketChannel = AsynchronousSocketChannel.open(channelGroup);
			socketChannel.connect(new InetSocketAddress("localhost", 5001), null,
				new CompletionHandler<Void, Void>() {
					@Override
					public void completed(Void result, Void attachment) {
						Platform.runLater(() -> {
							try {
								displayText("[연결 완료: " + socketChannel.getRemoteAddress() + "]");
								btnConn.setText("stop");
								btnSend.setDisable(false);
							} catch (Exception e) {}
						});
						receive();
					}

					@Override
					public void failed(Throwable exc, Void attachment) {
						Platform.runLater(() -> displayText("[서버 통신 안됨]"));
						if(socketChannel.isOpen()) { stopClient(); }
					}
				}
			);
			
		} catch (Exception e) {}
	}
	
	void stopClient() {
		//연결 끊기 코드
		try {
			Platform.runLater(() -> {
				displayText("[연결 끊음]");
				btnConn.setText("start");
				btnSend.setDisable(true);
			});
			
			if(channelGroup != null && !channelGroup.isShutdown()) {
				channelGroup.shutdownNow();
			}
		} catch (Exception e) {}
	}
	
	void receive() {
		//데이터 받기 코드
		ByteBuffer byteBuffer = ByteBuffer.allocate(100);
		socketChannel.read(byteBuffer, byteBuffer,
			new CompletionHandler<Integer, ByteBuffer>() {
				@Override
				public void completed(Integer result, ByteBuffer attachment) {
					attachment.flip();
					Charset charset = Charset.forName("UTF-8");
					String data = charset.decode(attachment).toString();
					Platform.runLater(() -> displayText("[받기 완료] "+ data));
					
					ByteBuffer byteBuffer = ByteBuffer.allocate(100);
					socketChannel.read(byteBuffer, byteBuffer, this);
				}

				@Override
				public void failed(Throwable exc, ByteBuffer attachment) {
					Platform.runLater(() -> displayText("[서버 통신 안됨]"));
					stopClient();
				}
			}
		);
	}
	
	void send(String data) {
		//데이터 전송 코드
		Charset charset = Charset.forName("UTF-8");
		ByteBuffer byteBuffer = charset.encode(data);
		socketChannel.write(byteBuffer, null, new CompletionHandler<Integer, Void> () {
			@Override
			public void completed(Integer result, Void attachment) {
				Platform.runLater(() -> displayText("[보내기 완료]"));
			}

			@Override
			public void failed(Throwable exc, Void attachment) {
				Platform.runLater(() -> displayText("[서버 통신 안됨]"));
				stopClient();
			}
			
		});
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
