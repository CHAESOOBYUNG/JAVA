package sec07.exam03_view;

import java.net.*;
import java.time.*;
import java.util.*;

import javafx.application.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import javafx.scene.image.*;

public class RootController implements Initializable {
	@FXML private ListView<String> listView; //ListView<아이템 타입>
	@FXML private TableView<IveMember> tableView; //TableView<모델 클래스>
	@FXML private ImageView imageView;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(FXCollections.observableArrayList(
			"장원영", "리즈", "안유진", "이서", "레이", "가을"
		));
		
		//selectedIndex 속성 감시
		listView.getSelectionModel().selectedIndexProperty().addListener(
			new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> observable, 
					Number oldValue, Number newValue) {
					tableView.getSelectionModel().select(newValue.intValue()); //변경된 인덱스 행 선택
					tableView.scrollTo(newValue.intValue()); //변경된 인덱스 위치로 스크롤 시킴
				}
			});
		
		ObservableList iveMemberList = FXCollections.observableArrayList( //총 6개 행 데이터
			new IveMember("장원영", "ive1.jpg"),
			new IveMember("리즈", "ive2.jpg"),
			new IveMember("안유진", "ive3.jpg"),
			new IveMember("이서", "ive4.jpg"),
			new IveMember("레이", "ive5.jpg"),
			new IveMember("가을", "ive6.jpg")
		);
		
		TableColumn tcIveMember = tableView.getColumns().get(0);
		tcIveMember.setCellValueFactory(new PropertyValueFactory("iveMember"));
		tcIveMember.setStyle("-fx-alignment: CENTER;");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER;");
		
		tableView.setItems(iveMemberList);
		
		//selectedItem 속성 감시
		tableView.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IveMember>() {
				@Override
				public void changed(ObservableValue<? extends IveMember> observable, 
					IveMember oldValue, IveMember newValue) {
					if(newValue != null) {
						imageView.setImage(new Image(
							getClass().getResource("images/" + newValue.getImage()).toString()));
					}
				}
			}
		);		
	}
	
	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView 아이브: " + item);
		
		IveMember iveMember = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView 아이브: " + iveMember.getIveMember());
		System.out.println("TableView 이미지: " + iveMember.getImage());
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}