package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcInsert01 {

	public static void main(String[] args) {
		/*
		CREATE TABLE MEMBERS(
               ID VARCHAR2(50) PRIMARY KEY,
               PW VARCHAR2(50),
               NAME VARCHAR2(50),
               EMAIL VARCHAR2(50)
        );
        */
		
		//INSERT, UPDATE, DELETE는 사용방법이 동일합니다.
		
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
		
		String sql = "INSERT INTO MEMBERS VALUES(?, ?, ?, ?)"; //위에서 입력받은 값 전달
		
		try {
			
			//드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//conn 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//pstmt 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			//sql실행
			int result = pstmt.executeUpdate(); //i, u, d 작업에 수행하고 성공시 1을 반환, 실패시 0을 반환
			
			if(result == 1) {
				System.out.println("insert성공");
			} else {
				System.out.println("insert실패");
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
