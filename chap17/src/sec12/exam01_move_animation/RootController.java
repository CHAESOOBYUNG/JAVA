package sec12.exam01_move_animation;

import java.net.*;
import java.util.*;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class RootController implements Initializable {
	@FXML private Button btnLogin;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(e -> handleBtnLogin(e));
	}
	
	public void handleBtnLogin(ActionEvent e) {
		//로그인 화면 이동
		try {
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();
			root.getChildren().add(login);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
}
