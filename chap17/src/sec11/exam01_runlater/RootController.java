package sec11.exam01_runlater;

import java.net.*;
import java.text.*;
import java.util.*;

import javafx.application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class RootController implements Initializable {
	@FXML private Label lblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private boolean stop;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event -> handleBtnStart(event));
		btnStop.setOnAction(event -> handleBtnStop(event));
	}
	
	public void handleBtnStart(ActionEvent e) {
		stop = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					String strTime = sdf.format(new Date());
					//UI 변경 작업
					Platform.runLater(() -> {
						lblTime.setText(strTime);
					});

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		};
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleBtnStop(ActionEvent e) {
		stop = true;
	}
}
