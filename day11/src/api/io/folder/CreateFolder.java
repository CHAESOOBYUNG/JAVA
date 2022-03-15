package api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 * 자바에서 외부경로로 폴더를 생성할 때는 File클래스를 사용합니다.
		 * 생성자 매개변수로 폴더를 생성할 경로 + 폴더명을 작성합니다.
		 * 
		 */
		
		try {
			File file = new File("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\folder_test");
			
			if(!file.exists() ) { //폴더가 존재하면 true, 없다면 false
				file.mkdir(); //폴더셍성
				
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("해당 폴더가 이미 존재합니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
