package sec07.exam03_chatting;

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
	}
	
	void stopServer() {
		//서버 종료 코드
	}
	
	class Client {
		//데이터 통신 코드
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
