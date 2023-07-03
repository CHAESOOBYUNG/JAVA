package sec08.exam01_menubar_toolbar;

import java.net.*;
import java.util.*;

import javafx.application.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;

public class RootController implements Initializable {
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleNew(ActionEvent e) {
		textArea.appendText("New\n");
	}
	
	public void handleOpen(ActionEvent e) {
		textArea.appendText("Open\n");
	}
	
	public void handleSave(ActionEvent e) {
		textArea.appendText("Save\n");
	}
	
	public void handleExit(ActionEvent e) {
		Platform.exit();
	}
}