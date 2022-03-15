package jdbc.basic;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JdbcSelect01 {

	public static void main(String[] args) {
		
		//데이터 베이스 연결주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
		
		//java.sql패키지에 있는 3가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//?는 SQL구문에 전달할 값을 ?로 표현합니다
		String sql = "SELECT * FROM EMPLOYEES WHERE JOB_ID = ?";
		
		try {
			//1. JDBC드라이버 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 커넥션 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. statement는 sql을 전달하기 위한 객체
			pstmt = conn.prepareStatement(sql);
			
			//4. ?에 전달할 값을 setter 메서드로 전달합니다.
			//?는 1번째 부터 순서값을 가지게 됩니다.
			pstmt.setString(1, "IT_PROG");
			
			//5. sql 실행
			rs = pstmt.executeQuery();
			
			//6. 결과처리
			
			while(rs.next() ) { //다음행이 있다면 true를 반환하고 다음행으로 전진.
				
				//행에 대한 처리 getString(컬럼명), getInt(컬럼명), getDouble(컬럼명) .....
				
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				Timestamp hire_date = rs.getTimestamp("hire_date"); //날짜형(java.sql 패키지)
				int salary = rs.getInt("salary");
				String job_id = rs.getString("job_id");
				
				System.out.println("id:" + employee_id);
				System.out.println("이름:" + first_name);
				System.out.println("입사일:" + hire_date);
				System.out.println("급여:" + salary);
				System.out.println("직무:" + job_id);
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
