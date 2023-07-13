package sec02.exam04_watchservice;

import java.nio.file.*;
import java.nio.file.WatchEvent.*;
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class WatchServiceExample extends Application {
	class WatchServiceThread extends Thread { //WatchServiceThread 클래스 선언
		@Override
		public void run() {
			try {
				//C:/Temp 디렉토리에 WatchService 등록
				WatchService watchService = FileSystems.getDefault().newWatchService();
				Path directory = Paths.get("C:/Temp");
				directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
											StandardWatchEventKinds.ENTRY_DELETE,
											StandardWatchEventKinds.ENTRY_MODIFY);
				
				while(true) {
					WatchKey watchKey = watchService.take(); //블로킹(WatchKey가 큐에 들어올 때까지)
					List<WatchEvent<?>> list = watchKey.pollEvents(); //WatchEvent 목록 얻기 
					for(WatchEvent watchEvent : list) {
						//이벤트 종류 얻기
						Kind kind = watchEvent.kind();
						//감지된 Path 얻기
						Path path = (Path)watchEvent.context();
						if(kind == StandardWatchEventKinds.ENTRY_CREATE) {
							//생성되었을 경우, 실행할 코드
							Platform.runLater(() -> textArea.appendText("파일 생성됨 -> " + 
													path.getFileName() + "\n"));
						} else if(kind == StandardWatchEventKinds.ENTRY_DELETE) {
							//삭제되었을 경우, 실행할 코드
							Platform.runLater(() -> textArea.appendText("파일 삭제됨 -> " + 
													path.getFileName() + "\n"));
						} else if(kind == StandardWatchEventKinds.ENTRY_MODIFY) {
							//변경되었을 경우, 실행할 코드
							Platform.runLater(() -> textArea.appendText("파일 변경됨 -> " +
													path.getFileName() + "\n"));
						} else if(kind == StandardWatchEventKinds.OVERFLOW) {
						}
					}
					boolean valid = watchKey.reset();
					if(!valid) { break; }
				}
			} catch (Exception e) {}
		}
	}

	TextArea textArea;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		textArea = new TextArea();
		textArea.setEditable(false);
		root.setCenter(textArea);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("WatchServiceExample");
		primaryStage.show();
		
		//WatchServiceThread 생성 및 시작
		WatchServiceThread wst = new WatchServiceThread();
		wst.start();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
