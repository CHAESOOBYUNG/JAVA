package sec02.exam02_application_lifecycle;

import java.util.*;

import javafx.application.*;
import javafx.stage.*;

public class AppMain extends Application {
	public AppMain() { //AppMain안에 UI생성코드 작성 O
		System.out.println(Thread.currentThread().getName() + ": AppMain() 호출");
	}
	
	@Override
	public void init() throws Exception { //init안에 UI생성코드 작성하면 안됨
		System.out.println(Thread.currentThread().getName() + ": init() 호출");
		Parameters params = this.getParameters();
		Map<String, String> map = params.getNamed();
		String ip = map.get("ip");
		String port = map.get("port");
		System.out.println("ip: " + ip);
		System.out.println("port: " + port);
	}

	//lifecycle_cmd_입력 참고, Run Configuration Arguments 참고
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() 호출");
		primaryStage.show(); //윈도우 보여주기
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() 호출");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() 호출");
		launch(args); //AppMain 객체 생성 및 메인 윈도우 생성
	}
}
