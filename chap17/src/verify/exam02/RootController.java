package verify.exam02;

import java.io.*;
import java.net.*;
import java.util.*;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class RootController implements Initializable {
	@FXML private Button btnAdd;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnAdd.setOnAction(event -> handleBtnAddAction(event));
	}

	private void handleBtnAddAction(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			dialog.setTitle("추가");
			
			Parent parent = FXMLLoader.load(getClass().getResource("form.fxml"));
			
			Button btnFormCancel = (Button) parent.lookup("#btnFormCancel");
			btnFormCancel.setOnAction(e -> dialog.close());
			
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (Exception e) {}
	}
}
