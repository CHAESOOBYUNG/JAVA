package sec02.stream_kind;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;

public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/sec02/stream_kind/linedata.txt"); //���� ��� ������ ������ �ִ� Path ��ü ����
		Stream<String> stream;
		
		//File.lines() �޼ҵ� �̿�
		stream = Files.lines(path, Charset.defaultCharset()); //�ü�� �⺻ ���ڼ�
		stream.forEach(System.out :: println); //�޼ҵ� ���� s -> System.out.println(s) �� ����
		stream.close();
		System.out.println();
		
		//BufferedReader�� lines() �޼ҵ� �̿�
		File file = path.toFile(); //path�κ��� File ��ü�� ����
		FileReader fileReader = new FileReader(file); //FileReader�� 18�忡�� �н�
		BufferedReader br = new BufferedReader(fileReader); //BufferedReader�� 18�忡�� �н�
		stream = br.lines();
		stream.forEach(System.out :: println); 
	}
}
