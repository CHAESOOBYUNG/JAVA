package sec05_try_with_resources;

public class FileInputStream implements AutoCloseable { //Autocloseable 인터페이스 구현 -> try-with-resource 사용
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다");
	}
	
	@Override
	public void close() throws Exception { //반드시 상속 -> Autocloseable 인터페이스 구현
		System.out.println(file + "을 닫습니다.");
	}
	
}
