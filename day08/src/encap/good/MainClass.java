package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.setYear(2021); //저장
		int year = me.getYear();
		System.out.println("년도:" + year);
		
		me.setSsn("1231231231231");
		System.out.println("번호:" + me.getSsn());
		
	}
}
