
package sec04.exam02_file_copy;

import java.nio.file.*;

public class FileCopyMethodExample {
	public static void main(String[] args) throws Exception {
		Path from = Paths.get("src/sec04/exam02_file_copy/ive2.jpg");
		Path to = Paths.get("src/sec04/exam02_file_copy/iveliz.jpg");
		
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사 성공");
	}
}
