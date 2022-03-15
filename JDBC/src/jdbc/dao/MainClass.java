package jdbc.dao;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//JDBC문장을 메서드로 옮기기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디>");
		String id = scan.next();
		
		//DAO객체 필요
		JdbcDAO dao = new JdbcDAO();
		Employees emp = dao.selectTest(id);
		
		System.out.println("직업아이디:" + emp.getJob_id());
		System.out.println("이름:" + emp.getFirst_name());
		
		
		
		
	}
}
