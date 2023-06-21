package sec06.exam01_property_listener;

import java.net.*;
import java.util.*;

import javafx.beans.value.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class RootController implements Initializable {
	@FXML private Slider slider;
	@FXML private Label label;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, 
								Number oldValue, Number newValue) { 
								//oldValue - 크기 변경 이전 값, newValue - 크기 변경 이후 값
				label.setFont(new Font(newValue.doubleValue()));
				//label.setFont - Label의 폰트 변경 / newValue.doubleValue() - Slider의 변경된 Value 값
			}
		});
	}	
}
