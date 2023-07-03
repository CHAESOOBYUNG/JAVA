package sec09.exam01_dialog;

import java.io.*;
import java.net.*;
import java.text.NumberFormat.*;
import java.util.*;

import javafx.application.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.stage.FileChooser.*;

public class RootController implements Initializable {
	//@FXML private HBox hbox;
	
	private Stage primaryStage;
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleOpenFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("Text Files", "*.txt"),
			new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
			new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
			new ExtensionFilter("All Files", "*.*")
		);
		//File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	
	public void handleSaveFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.*"));
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	
	public void handleDirectoryChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDir = directoryChooser.showDialog(primaryStage);
		if(selectedDir != null) {
			System.out.println(selectedDir.getPath());
		}
	}
	
	public void handlePopup(ActionEvent e) throws Exception {
		Popup popup = new Popup();
		
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		ImageView imageView = (ImageView) parent.lookup("#imgMessage");
		imageView.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
		imageView.setOnMouseClicked(event->popup.hide());
		
		Label lblMessage = (Label) parent.lookup("#lblMessage");
		lblMessage.setText("메세지가 왔습니다.");
		
		popup.getContent().add(parent);
		popup.setAutoHide(true);
		popup.show(primaryStage);
	}
	
	public void handleCustom(ActionEvent e) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("확인");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		Label txtTitle = (Label) parent.lookup("#txtTitle");	
		txtTitle.setText("확인하셨습니까?");
		Button btnOk = (Button) parent.lookup("#btnOk");
		btnOk.setOnAction(event -> dialog.close());
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
}