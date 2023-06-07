package sec02.stream_kind;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FromDirectoryExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\Chae Soobyung\\Desktop\\course\\Java\\workspace");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()));
		//p - 서브 디렉토리 or 파일에 해당하는 Path 객체
		//p.getFileName() -> 서브 디렉토리 이름 or 파일 이름 리턴
	}
	
}
