package sec02.stream_kind;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;

public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/sec02/stream_kind/linedata.txt"); //파일 경로 정보를 가지고 있는 Path 객체 생성
		Stream<String> stream;
		
		//File.Lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset()); //운영체제 기본 문자셋
		stream.forEach(System.out :: println); //메소드 참조 s -> System.out.println(s) 와 동일
		stream.close();
		System.out.println();
		
		//BufferedReader의 lines() 메소드 이용
		File file = path.toFile(); //path로부터 File 객체를 얻음
		FileReader fileReader = new FileReader(file); //FileReader는 18장에서 학습
		BufferedReader br = new BufferedReader(fileReader); //BufferedReader는 18장에서 학습
		stream = br.lines();
		stream.forEach(System.out :: println);
	}
}
