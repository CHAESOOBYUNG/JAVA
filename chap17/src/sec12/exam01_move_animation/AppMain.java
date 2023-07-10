package sec12.exam01_move_animation;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

public class AppMain extends Application { //문서 생성 X
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.setWidth(350); //윈도우의 고정 폭 설정 
		primaryStage.setHeight(500); //윈도우의 고정 높이 설정
		primaryStage.setResizable(false); //윈도우 크기를 조정할 수 없도록 함
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
