package sec15.exam02_format;

import java.text.*;

public class MessageFormatExample {
	public static void main(String[] args) {
		//동적 객체로 삽입
		String id = "Java"; //{0}
		String name = "채수병"; //{1}
		String tel = "010-1234-5678"; //{2}
				
		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		String sql = "insert into Member values( {0}, {1}, {2} )";
		Object[] arguments = {"Java", "채수병", "010-1234-5678"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
