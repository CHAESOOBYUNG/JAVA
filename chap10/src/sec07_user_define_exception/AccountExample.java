package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			/* if((message.equals("1004"))) {...}
			if((message.equals("1005"))) {...} */
			System.out.println(message);
			System.out.println(e.toString()); //개발자에게 예외 코드 보여줌
			System.out.println();
			e.printStackTrace(); //예외처리, 디버깅 쉽게 하기 위해 모두 보여줌ㄴ
		}
	}
}	
