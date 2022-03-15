package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcSelect02 {

	public static void main(String[] args) {
		
		/* 
		 * employees에서 조회
		 * id를 입력받아서 아이디에 해당하는 회원정보를 employees에서 조회하여 출력하세요.
		 * 회원아이디, first_name, job_id, 부서정보
		 * 회원정보를 조회하여 출력하세요.
		 */
		
        Scanner scan = new Scanner(System.in);
		System.out.println("아이디>");
		String id = scan.next();
		
		//데이터 베이스 연결주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
				
		//java.sql패키지에 있는 3가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, DEPARTMENT_ID "
				+ "FROM EMPLOYEES "
				+ "WHERE EMPLOYEE_ID = ?";
		
		
        try {
        	//1. 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. conn 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. pstmt 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//4. sql실행
			rs = pstmt.executeQuery(); 
			
			if(rs.next()) { //키를 이용해서 조회했기 때문에 결과는 1개
				
			   int employee_id = rs.getInt("employee_id");
			   String first_name = rs.getString("first_name");
			   String job_id = rs.getString("job_id");
			   int department_id = rs.getInt("department_id");
			   
			   System.out.println(employee_id);
			   System.out.println(first_name);
			   System.out.println(job_id);
			   System.out.println(department_id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				
			}
		
		}
			
			
		
		
	}
}
