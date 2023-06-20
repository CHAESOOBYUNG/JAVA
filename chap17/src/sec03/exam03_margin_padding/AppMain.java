package sec03.exam03_margin_padding;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//패딩 설정--------------------------
		/* HBox hbox = new HBox();
		hbox.setPadding(new Insets(50, 10, 10, 50)); //안쪽 여백(패딩) 설정 / 시계방향(top, right, bottom, left)
			Button button = new Button();
			button.setPrefSize(100, 100); */
			
		//마진 설정---------------------------
		HBox hbox = new HBox();
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(10, 10, 50, 50)); //바깥 여백(마진) 설정 / 시계방향(top, right, bottom, left)
			
		hbox.getChildren().add(button);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
