package sec04.exam01_file;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt")); 
		//파일 경로를 URI 객체로 생성해서 매개값으로 제공해도 됨.
		
		if(dir.exists() == false) { dir.mkdirs(); } //경로상에 없는 모든 디렉토리 생성
		if(file1.exists() == false) { file1.createNewFile(); } //새로운 파일 생성
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles(); 
		//디렉토리에 포함된 파일 및 서브디렉토리 목록 전부 -> File 배열로 리턴
		System.out.println("날짜        시간          형태             크기     이름");
		System.out.println("----------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			//lastModified() - 마지막 수정 날짜 및 시간 리턴
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName()); //파일의 이름 리턴
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); //파일의 크기 리턴
			}
			System.out.println();
		}
	}
}
