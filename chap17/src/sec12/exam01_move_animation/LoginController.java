package sec12.exam01_move_animation;

import java.net.*;
import java.util.*;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class LoginController implements Initializable {
	@FXML private BorderPane login;
	@FXML private Button btnMain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e -> handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent e) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			root.getChildren().remove(login); //StackPane에서 로그인 화면 제거
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
}
