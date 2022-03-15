package final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍한국");
//		p1.nation = "미국"; //변경x
		System.out.println("ssn:" + p1.ssn);
		
		Person p2 = new Person("234234", "홍미국");
		System.out.println("ssn:" + p2.ssn);
		
	}
}
