package sec05_try_with_resources;

public class TryWithResourcesExample {
	/*	
	 *  https://docs.oracle.com/javase/8/docs/api/index.html
	 *  -> 왼쪽 상단 창 -> java.io -> 왼쪽 하단 창 -> FileInputStream, FileOutputStream -> AutoCloseable 
	 *  (try-with-resource 기능 사용 가능 -> 자동으로 close() 생성)
	 *  
	 *  -> 왼쪽 상단 창 -> java.net -> 왼쪽 하단 창 -> ServerSocket, Socket -> AutoCloseable 
	 *  (try-with-resource 기능 사용 가능 -> 자동으로 close() 생성)
	 *  
	 *  -> 왼쪽 상단 창 -> java.nio.channels -> 왼쪽 하단 창 -> FileChannel, ServerSocketChannel, SocketChannel
	 *  -> AutoCloseable 
	 *  (try-with-resource 기능 사용 가능 -> 자동으로 close() 생성)
	 */

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read(); //자동으로 close() 실행
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 시행되었습니다.");
		}
	}
	
}
