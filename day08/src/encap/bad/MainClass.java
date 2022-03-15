package encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//변수를 public으로 열어두면, 잘못된 값이 저장 될 수도 있습니다.
		me.year = 2021;
		me.month = 12;
		me.day = 100;
		me.ssn = "알아서 뭐하게!?";
		
		me.info();
		
	}
}
