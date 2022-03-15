package api.io.folder;

import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) {
		
		//폴더나, 파일을 지우는 방법.
		
		try {
			//폴더경로 + //지울폴더
			File file = new File("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\file\\folder_test");
			
			if(file.exists() ) {
				file.delete(); //삭제되면 true반환, 실패시 false를 반환
				
				System.out.println("파일 삭제 성공");
			} else {
				System.out.println("파일 삭제 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
