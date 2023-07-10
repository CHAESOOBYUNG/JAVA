package sec11.exam02_task;

import java.net.*;
import java.util.*;

import javafx.concurrent.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class RootController implements Initializable {
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private Task<Void> task; 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event -> handleBtnStart(event));
		btnStop.setOnAction(event -> handleBtnStop(event));
	}
	
	public void handleBtnStart(ActionEvent e) {
		task = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				for(int i = 0; i <= 100; i++) {
					if(isCancelled()) {
						updateMessage("취소됨");
						break;
					}
					//Task의 progress와 message 속성을 업데이트
					updateProgress(i, 100);
					updateMessage(String.valueOf(i));
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						if(isCancelled()) {
							updateMessage("취소됨");
							break;
						}
					}
				}
				return null;
			}
		};
		
		progressBar.progressProperty().bind(task.progressProperty());
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
 	}

	public void handleBtnStop(ActionEvent e) {
		task.cancel(); //작업 취소
	}
}
