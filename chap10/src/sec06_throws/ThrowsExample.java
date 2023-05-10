package sec06_throws;

public class ThrowsExample {
	/* throws 사용하는 생성자, 메소드
	 * https://docs.oracle.com/javase/8/docs/api/index.html -> 왼쪽 상단창 java.io
	 * -> 왼쪽 하단창 FileInputStream 
	 * (1) -> Constructors -> FileInputStream(File file)
	 * -> public FileInputStream(String name)
     *          throws FileNotFoundException -> FileNotFoundException 개발자가 처리해야 함. 
     * (2) -> Method Summary -> read() 
     * -> public int read()
         		  throws IOException -> IOException 개발자가 처리해야 함.
	 */
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.String2");
	}
}
