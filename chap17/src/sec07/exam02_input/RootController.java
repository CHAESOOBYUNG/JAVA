package sec07.exam02_input;

import java.net.*;
import java.time.*;
import java.util.*;

import javafx.application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class RootController implements Initializable {
	@FXML private TextField txtTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;
	@FXML private TextArea txtContent;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		String title = txtTitle.getText();
		System.out.println("title: " + title);
		
		String password = txtPassword.getText();
		System.out.println("password: " + password);
		
		String strPublic = comboPublic.getValue();
		System.out.println("public: " + strPublic);
		
		LocalDate localDate = dateExit.getValue();
		if(localDate != null) {
			System.out.println("dateExit: " + localDate.toString());
		}
		
		String content = txtContent.getText();
		System.out.println("content: " + content);
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}