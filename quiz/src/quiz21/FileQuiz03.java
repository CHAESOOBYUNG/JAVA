package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {

	public static void main(String[] args) {
		/*
		 * 1. Date or LocalDateTime클래스를 이용해서 file경로의 하위폴더로
		 *      오늘날짜(20211220) 폴더를 만드세요.
		 *      
		 * 2. 스캐너로 파일명을 입력받고, BufferedWriter클래스를 이용해서 .txt파일을 생성.
		 * 3. exit 문자열을 받을 때 까지 엔터를 포함해서 입력받습니다.
		 *    \r\n을 적절하게 이용하면 됩니다.
		 *    
		 * 4. 파일을 다 썼다면 아무 방법으로 읽어오세요.
		 */

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		String now = sdf.format(date);

		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = null;
		BufferedReader br = null;


		try {
			File file = new File("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\" + now);

			if( !file.exists() ) {
				file.mkdir();
				System.out.println("폴더가 생성되었습니다");
			} else {
				System.out.println("폴더가 이미 존재합니다");
			}

			//스트림을 통해 입력받는 기능
			//			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("파일명>");
			String name = br.readLine();			
			//			bw = new BufferedWriter( new FileWriter("") );

			//			System.out.println(file.getPath()); 
			
			System.out.println(file.getPath() + "\\" + name + ".txt", "UTF-8");
			
			System.out.println("exit을 입력하면 입력종료");
			while(true) {
				System.out.println(">");
				String str = br.readLine(); //입력
				
				if(str.equals("exit")) break;
				bw.write(str + "\r\n");//문자를 쓴다.
				
				}
			
			bw.flush(); //버퍼를 밀어냄
			
			//////////////////////////////////////////////////////////
			/////////////////////파일을 읽는다///////////////////////////
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(""), "UTF-8"));
           
			String result;
			while(((result = br.readLine()) != null)) {
				System.out.println(result);
			}
		    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			}
		}



	}
}
