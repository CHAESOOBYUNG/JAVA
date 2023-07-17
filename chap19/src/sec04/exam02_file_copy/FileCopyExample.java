package sec04.exam02_file_copy;

import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class FileCopyExample {
	public static void main(String[] args) throws Exception{
		Path from = Paths.get("src/sec04/exam02_file_copy/ive2.jpg");
		Path to = Paths.get("src/sec04/exam02_file_copy/iveliz.jpg");
		
		//읽기 FileChannel 생성
		FileChannel fileChannel_form = FileChannel.open(from, StandardOpenOption.READ);
		
		//쓰기 FileChannel 생성
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		ByteBuffer buffer = ByteBuffer.allocateDirect(100);
		int byteCount;
		while(true) {
			buffer.clear();
			byteCount = fileChannel_form.read(buffer);
			if(byteCount == -1) break;
			buffer.flip();
			fileChannel_to.write(buffer);
		}
		
		fileChannel_form.close();
		fileChannel_to.close();
		System.out.println("파일 복사 성공");
	}
}
