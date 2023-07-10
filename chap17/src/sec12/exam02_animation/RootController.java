package sec12.exam02_animation;

import java.net.*;
import java.util.*;

import javafx.animation.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.util.*;

public class RootController implements Initializable {
	@FXML private Button btnLogin;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(e->handleBtnLogin(e));
	}

	private void handleBtnLogin(ActionEvent e) {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();
			root.getChildren().add(login);
			
			login.setTranslateX(350); //시작값을 350으로 설정(로그인 화면의 폭)
			
			//종료값을 0으로 설정하고 0.1초간 지속
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
