package verify.exam11;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = 
		"C:/Users/Chae Soobyung/Desktop/course/Java/workspace/chap18/src/sec04/exam03_fileoutputstream/lizimg.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] fileNameBytes = fileName.getBytes("UTF-8");
		fileNameBytes = Arrays.copyOf(fileNameBytes, 100); //길이 100짜리 배열
		os.write(fileNameBytes);
		
		System.out.println("[파일 보내기 시작] " + fileName);
		FileInputStream fis = new FileInputStream(file);
		byte[] bytes = new byte[1000];
		int readByteCount = -1;
		while((readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes, 0 , readByteCount);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
