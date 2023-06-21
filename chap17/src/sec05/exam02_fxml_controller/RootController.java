package sec05.exam02_fxml_controller;

import java.net.*;
import java.util.*;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class RootController implements Initializable {
	@FXML private Button btn1; //btn1 객체 주입
	@FXML private Button btn2; //btn2 객체 주입
	@FXML private Button btn3; //btn3 객체 주입
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);
			}
		}); //직접 EventHandler 생성 후 등록
		
		btn2.setOnAction(event -> handleBtn2Action(event)); //람다식 사용
		// btn3.setOnAction(event -> handleBtn3Action(event)); //람다식 사용
	}
	
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼 1 클릭");
	}
	
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼 2 클릭");
	}
	
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼 3 클릭");
	}
}
