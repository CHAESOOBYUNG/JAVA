package sec07.exam01_button;

import java.net.*;
import java.util.*;

import javafx.application.*;
import javafx.beans.binding.*;
import javafx.beans.value.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;

public class RootController implements Initializable {
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		//ToggleGroup의 selectedToggle 속성 감시 리스너 설정
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, 
					Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("images/" + newValue.getUserData().toString() + ".jpg").toString());
				//newValue.getUserData().toString() - 선택된 컨트롤의 userData 속성값
				radioImageView.setImage(image);
			}
		});
	}
	
	public void handleCheckAction(ActionEvent e) { //CheckBox 이벤트 처리
		if(chk1.isSelected() && chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/heart_star.jpg").toString()));
		} else if(chk1.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/smallheart.gif").toString()));
		} else if(chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/star.gif").toString()));
		} else {
			checkImageView.setImage(new Image(getClass().getResource("images/ive2.jpg").toString()));
		}
	}
	
	public void handleBtnExitAction(ActionEvent e) { //Button 이벤트 처리
		Platform.exit();
	}
}
