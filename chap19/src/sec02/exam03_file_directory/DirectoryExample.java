package sec02.exam03_file_directory;

import java.io.*;
import java.nio.file.*;

public class DirectoryExample {
	public static void main(String[] args) throws Exception {
		Path path1 = Paths.get("C:/Temp/Dir/subDir");
		Path path2 = Paths.get("C:/Temp/file.txt");
		
		if(Files.notExists(path1)) {
			Files.createDirectories(path1); //경로상에 존재하지 않는 모든 디렉토리 생성
		}
		
		if(Files.notExists(path2)) {
			Files.createFile(path2); //파일 생성
		}
		
		Path path3 = Paths.get("C:/Temp");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3); //디렉토리 내용을 스트림(반복자)으로 얻음
		for(Path path : directoryStream) {
			if(Files.isDirectory(path)) {
				System.out.println("[디렉토리] " + path.getFileName()); //디렉토리 Path
			} else {
				System.out.println("[파일] " + path.getFileName() + " (크기:" + Files.size(path) + ")"); //파일 크기
			}
		}
	}
}
