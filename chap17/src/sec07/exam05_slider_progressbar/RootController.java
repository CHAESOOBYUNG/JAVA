package sec07.exam05_slider_progressbar;

import java.net.*;
import java.util.*;

import javafx.application.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import javafx.scene.image.*;
import javafx.scene.media.*;
import javafx.util.*;

public class RootController implements Initializable {
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	@FXML private ProgressBar progressBar;
	@FXML private Label labelTime; 
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider sliderVolume;
	
	private boolean endOfMedia; //재생 완료를 의미하는 플래그 필드

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//미디어 객체 생성
		Media media = new Media(getClass().getResource("media/ivevideo.mp4").toString());
		//Media media = new Media(getClass().getResource("media/iamaudio.mp3").toString());
		//미디어 플레이어 생성 및 미디어 뷰에 설정
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		//해당 상태가 되면 실행할 Runnable 설정
		mediaPlayer.setOnReady(new Runnable() { //Ready 상태가 될 때 실행
			@Override
			public void run() {
				btnPlay.setDisable(false); 
				btnPause.setDisable(true);
				btnStop.setDisable(true);
				if(mediaPlayer.isAutoPlay()) {
					mediaView.setVisible(false);
				}
				
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> observable, 
							Duration oldValue, Duration newValue) {
						double progress = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						labelTime.setText(
								(int)mediaPlayer.getCurrentTime().toSeconds() + "/" +
								(int)mediaPlayer.getTotalDuration().toSeconds() +"sec"
						); 
					}  
				});
			}
		});
		
		mediaPlayer.setOnPlaying(() -> { //Playing 상태가 될 때 실행
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnPaused(() -> { //Paused 상태가 될 때 실행
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		
		mediaPlayer.setOnStopped(() -> { //Stopped 상태가 될 때 실행
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		
		mediaPlayer.setOnEndOfMedia(() -> { //EndOfMedia 상태가 될 때 실행
			endOfMedia = true;
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
		});
		
		//볼륨 설정
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
			}
		});
		sliderVolume.setValue(50.0);
		
		//버튼 ActionEvent 처리
		btnPlay.setOnAction(event -> {
			if(endOfMedia) { //EndOfMedia 상태일 경우
				mediaPlayer.stop(); //재생 중지
				mediaPlayer.seek(mediaPlayer.getStartTime()); //재생 시간을 처음으로 되돌림
			}
			mediaPlayer.play(); //미디어 재생
			endOfMedia = false;
		});
		
		btnPause.setOnAction(event -> {
			mediaPlayer.pause(); //미디어 일시정지
		});
		
		btnStop.setOnAction(event -> {
			mediaPlayer.stop(); //미디어 중지
		});
	}
}