package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDelete01 {

	public static void main(String[] args) {
		
		/* insert문장과 비슷
		 * 
		 * id를 입력받아서 아이디에 해당하는 데이터를 삭제하는 jdbc프로그램을 작성하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 아이디>");
		String id = scan.next();
		
		//1. DB연결에 필요한 변수 선언
		//데이터 베이스 연결주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
		
		//java.sql패키지에 있는 3가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		String sql = "DELETE FROM MEMBERS WHERE ID = ?";
		
		try {
			
			//1. 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. conn 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. pstmt 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//4. sql실행
			int result = pstmt.executeUpdate(); //i, d, u 실행 (성공시 1, 실패시 0)
			
			if(result == 1) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
