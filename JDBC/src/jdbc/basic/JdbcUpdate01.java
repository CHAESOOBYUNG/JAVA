package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate01 {

	public static void main(String[] args) {
		
		/*
		 * insert랑 구문이 크게 다르지 않습니다.
		 * 
		 * 수정할 아이디, 이메일, 주소를 받아서 members 테이블을 수정하면 됩니다.
		 * 수정이 성공이라면 "수정성공", 실패라면 "수정실패" 구문을 출력해주세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디>");
		String id = scan.next();
		System.out.println("비밀번호>");
		String pw = scan.next();
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("이메일>");
		String email = scan.next();
		
		//1. DB연결에 필요한 변수 선언
		//데이터 베이스 연결주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
		
		//java.sql패키지에 있는 3가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEMBERS SET PW = ?, NAME = ?, EMAIL = ? WHERE ID = ?";
		
		try {
			
			//1. 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. conn 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. pstmt 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, email); 
			pstmt.setString(4, id);
			
			//4. sql실행
			int result = pstmt.executeUpdate(); //i, d, u 실행 (성공시 1, 실패시 0)
			
			if(result == 1) {
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패(id확인)");
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
