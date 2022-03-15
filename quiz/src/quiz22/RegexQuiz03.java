package quiz22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {
		//1. 프로젝트 하위에 lib폴더 생성(src와 같은 level)
		//2. 필요한 jar파일을 lib에 넣기
		//3. 프로젝트 우클릭 build_path -> library탭 -> add jar로 추가

		//메일 - yopy0817@gmail.com

		/*
		 * 1. day, store, grade, detail, price를 멤버변수로 갖는 Product클래스를 생성.
		 * 2. getter, setter생성
		 * 
		 * 3. Product를 제네릭으로 갖는 List를 생성합니다. 
		 * 4. BufferedReader 이용해서 건담.txt를 readLine()으로 읽어들입니다.
		 * 5. 날짜, 지점, 등급, 상품내용, 가격을 패턴분석해서 Product에 저장하고 list에 저장.
		 * 
		 * 6. 분석한 패턴을 xlsx형식의 엑셀파일로 뽑으면 된다.
		 * 
		 */

		XSSFWorkbook workbook = new XSSFWorkbook();

		List<String> Product = new ArrayList<>();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt"));

			String str;
			while((str = br.readLine()) != null) {
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		String str;
		String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]+";//날짜
		String pattern2 = "[가-힣]+"; //지점
		String pattern3 = "//[[A-Za-z]//]"; //등급1
		String pattern4 =  "//[[가-힣]//]"; //등급2
		String pattern5 = "1/[0-9]{3}??[A-Za-z]?[A-Za-z]-[0-9]+[A-Za-z]?[A-Za-z]-[0-9]?[가-힣]+?//([가-힣]//)?[0-9]+?"; //상품내용
		String pattern6 = "[0-9]+,?[0-9]+원"; //가격

		Pattern p1 = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		Pattern p3 = Pattern.compile(pattern3);
		Pattern p4 = Pattern.compile(pattern4);
		Pattern p5 = Pattern.compile(pattern5);
		Pattern p6 = Pattern.compile(pattern6);

		Matcher m1 = p1.matcher("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt");
		Matcher m2 = p2.matcher("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt");
		Matcher m3 = p3.matcher("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt");
		Matcher m4 = p4.matcher("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt");
		Matcher m5 = p5.matcher("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt");
		Matcher m6 = p6.matcher("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt");

		while(m1.find()) {

		}
		while(m2.find()) {

		}
		while(m3.find()) {

		}
		while(m4.find()) {

		}
		while(m5.find()) {

		}
		while(m6.find()) {

		}
		
		
		Product.add(pattern1);
		Product.add(pattern2);
		Product.add(pattern3);
		Product.add(pattern4);
		Product.add(pattern4);
		Product.add(pattern6);
		
		try {
		    FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Chae Soobyung\\eclipse-workspace\\quiz\\src\\quiz22\\건담.txt"));
		    workbook.write(fos);
		    fos.close();
		} catch(IOException e) {
		    e.printStackTrace();
		}
	            
	}
}



