package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDAO {

	//데이터 베이스 연결주소
	String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	String uid = "HR";
	String upw = "HR";
						
	//java.sql패키지에 있는 3가지 클래스 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
			
	public Employees selectTest(String id) {
		//외부에서 받을 값을 매개변수로 선언
		//jdbc코드
		
		Employees emp = new Employees(); //결과를 받환받을 객체를 위해 선언
		   
		
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
			   
			   //emp에 조회한 결과를 저장
			   //Employees emp = new Employees(employee_id, first_name, job_id, department_id);
			   
			   emp.setEmployee_id(employee_id);
			   emp.setFirst_name(first_name);
			   emp.setJob_id(job_id);
			   emp.setDepartment_id(department_id);
			   
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

		return emp;
	}
	
}
