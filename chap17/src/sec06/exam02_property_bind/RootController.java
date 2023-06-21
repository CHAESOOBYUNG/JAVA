package sec06.exam02_property_bind;

import java.net.*;
import java.util.*;

import javafx.beans.binding.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class RootController implements Initializable {
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
	}
}
