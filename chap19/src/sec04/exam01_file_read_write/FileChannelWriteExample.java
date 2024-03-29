package sec04.exam01_file_read_write;

import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;

public class FileChannelWriteExample {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:/Temp/file.txt");
		Files.createDirectories(path.getParent());
	
		//FileChannel 생성
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		String data = "안녕하세요";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		int byteCount = fileChannel.write(byteBuffer); //파일에 데이터 쓰기
		System.out.println("file.txt: " + byteCount + " bytes written");
		
		fileChannel.close();
	}
}
