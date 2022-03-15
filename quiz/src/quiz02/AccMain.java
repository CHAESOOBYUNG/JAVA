package quiz02;

public class AccMain {

	public static void main(String[] args) {
		
		Account acc = new Account("홍길동", "1234", 2000);
		
		acc.deposit(1000); //+1000
		acc.withDraw(1500); //-1500
		
		int bal = acc.getBalance();
		System.out.println(acc.name + "의 잔액:" + bal);
		
	}
}
