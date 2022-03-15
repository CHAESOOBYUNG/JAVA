package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. Date나 LocalDateTime클래스를 이용해서 file 경로에 오늘날짜.txt 이름으로 파일을 씁니다.
		 * 2. 내용은 아무거나 작성하세요.
		 * 3. 파일이 정상 출력되었다면, BufferedReader클래스를 이용해서 파일의 내용을 읽어오세요.
		 * 
		 */
		
		//Date = SimpleDateFormat
		//LocalDateTime - DateTimeFormatter
		
		
		Scanner scan = new Scanner(System.in);
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		LocalDate now = LocalDate.now();
		String format = now.format( DateTimeFormatter.ofPattern("yyyyMMdd"));
		
		System.out.println(format);
		
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\" + format + ".txt"));
			
			System.out.println("내용을 작성하세요>");
			String str = scan.nextLine();
			
			bw.write(str); //쓰고
			bw.flush(); //버퍼 출력
			
			
			///////////////////////파일 읽기///////////////////////////
			
			
			br = new BufferedReader(new FileReader("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\" + format +".txt"));
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				scan.close();
			} catch (Exception e2){
				e2.printStackTrace();
			}
		
		}
		
		
		
	}
}
