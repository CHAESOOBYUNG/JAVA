package sec07.exam03_chatting;

import java.net.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ClientExample extends Application{
	Socket socket;
	
	void startClient() {
		//연결 시작 코드
	}
	
	void stopClient() {
		//연결 끊기 코드
	}
	
	void receive() {
		//데이터 받기 코드
	}
	
	void send(String data) {
		//데이터 전송 코드
	}
	
	///////////////////////////////////////
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
			
			//start와 stop 버튼을 클릭했을 때 이벤트 처리 코드
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
			btnSend.setOnAction(e->send(txtInput.getText())); //send 버튼을 클릭했을 때 이벤트 처리 코드
			
			bottom.setCenter(txtInput);
			bottom.setLeft(btnConn);
			bottom.setRight(btnSend);
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event -> stopClient()); //윈도우 우측 상단 닫기 버튼을 클릭했을 때 이벤트 처리 코드
		primaryStage.show();
	}
	
	//TextArea에 문자열을 추가하는 메소드
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
