package sec08.exam04_overloading;

public class Calculator {
	double areaRectangle(double width) { //정사각형
		return width * width;
	}
	
	double areaRectangle(double width, double height) { //직사각형
		return width * height;
	}
}
