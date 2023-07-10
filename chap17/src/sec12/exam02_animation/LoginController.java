package sec12.exam02_animation;

import java.net.*;
import java.util.*;

import javafx.animation.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.util.*;

public class LoginController implements Initializable{
	@FXML private BorderPane login;
	@FXML private Button btnMain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e -> handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent e) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			login.setTranslateX(0); //시작값을 0으로 설정
			
			//출력값을 350으로 설정하고, 0.1초간 애니메이션 진행
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
					Duration.millis(100), 
					new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							root.getChildren().remove(login); //애니메이션 종료 후 로그인 화면 제거
						}
					},
					keyValue
					);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
