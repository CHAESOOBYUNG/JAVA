package sec07.exam06_chart;

import java.net.*;
import java.util.*;

import javafx.collections.*;
import javafx.fxml.*;
import javafx.scene.chart.*;

public class RootController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pieChart.setData(FXCollections.observableArrayList( //PieChart 데이터 설정
			new PieChart.Data("이서", 10),
			new PieChart.Data("안유진", 30),
			new PieChart.Data("장원영", 25),
			new PieChart.Data("리즈", 10)
		));
		
		//시리즈 1 생성
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("남자");
		series1.setData(FXCollections.observableArrayList(
			new XYChart.Data("2020", 70),
			new XYChart.Data("2021", 40),
			new XYChart.Data("2022", 50),
			new XYChart.Data("2023", 30)
		));
		
		//시리즈 2 생성
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("여자");
		series2.setData(FXCollections.observableArrayList(
			new XYChart.Data("2020", 70),
			new XYChart.Data("2021", 40),
			new XYChart.Data("2022", 50),
			new XYChart.Data("2023", 30)
		));
		
		
		//시리즈 1, 2를 차트에 추가
		barChart.getData().add(series1);
		barChart.getData().add(series2);
		
		//시리즈 3 생성
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("평균 온도");
		series3.setData(FXCollections.observableArrayList(
			new XYChart.Data("2020", 13),
			new XYChart.Data("2021", 6),
			new XYChart.Data("2022", 22),
			new XYChart.Data("2023", 19)
		));
		areaChart.getData().add(series3); //시리즈 3을 차트에 추가
	}
}