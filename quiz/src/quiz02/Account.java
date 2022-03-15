package quiz02;

public class Account {
	//은행계좌
	String name;
	String password;
	int balance;
	
	//생성자
	Account(String pName, String pw, int bal) {
		name = pName;
		password = pw;
		balance = bal;
	}
	//기능
	void deposit(int money) {
		balance += money;
	}
	//출금
	void withDraw(int money) {
		balance -= money;
	}
	//잔액조회
	int getBalance() {
		return balance;
	}
}
