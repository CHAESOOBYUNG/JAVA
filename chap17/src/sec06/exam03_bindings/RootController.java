package sec06.exam03_bindings;

import java.net.*;
import java.util.*;

import javafx.beans.binding.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;

public class RootController implements Initializable {
	@FXML private AnchorPane root;
	@FXML private Circle circle;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
	}
}
