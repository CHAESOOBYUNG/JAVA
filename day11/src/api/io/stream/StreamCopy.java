package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopy {

	public static void main(String[] args) {

		//1. inputStream, outputStream은 문자를 읽기에 적합하지 않고.
		//   이미지, 동영상 파일을 읽는데 사용합니다.

		FileInputStream fis = null;
		FileOutputStream fos = null;


		try {
			fis = new FileInputStream("C:\\Users\\Chae Soobyung\\Pictures\\Saved Pictures\\1.jpg");

			fos = new FileOutputStream("C:\\Users\\Chae Soobyung\\Desktop\\eclipse\\1_copy.jpg");


			byte[] arr = new byte[100]; //100바이트 단위로 읽는다.

			/*
			while(true) {

				int result = fis.read(arr);

				if(result == -1) break;

				fos.write(arr, 0, result); //배열의 0에서~ 읽은 길이까지 써내린다.

//				System.out.println(result); //읽어온 데이터의 길이


			}
			 */

			int result;
			while( (result = fis.read(arr) ) != -1 ) {
				fos.write(arr, 0, result);
			}

			System.out.println("파일이 정상 복사되었습니다");


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
