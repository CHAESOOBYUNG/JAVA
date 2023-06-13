package sec03.exam01_programmatical_layout;

import java.util.*;

import javafx.application.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.transform.*;
import javafx.stage.*;

public class AppMain extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(); //HBox 컨테이너 생성
		hbox.setPadding(new Insets(10)); //안쪽 여백 설정
		hbox.setSpacing(10); //컨트롤 간의 수평 간격 설정
		
		TextField textField = new TextField(); //TextField 컨트롤 생성
		textField.setPrefWidth(200); //TextField 폭 설정
		
		Button button = new Button(); //Button 컨트롤 생성
		button.setText("확인"); //Button 글자 생성
		
		ObservableList list = hbox.getChildren(); //HBox의 ObservableList 얻기 
		list.add(textField); //TextField의 컨트롤 배치
		list.add(button); //Button의 컨트롤 배치
		
		Scene scene = new Scene(hbox); //장면 생성
		
		primaryStage.setTitle("AppMain"); //윈도우 창 제목 설정
		primaryStage.setScene(scene); //윈도우 창에 장면 설정
		primaryStage.show(); //원도우 창 보여주기
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
