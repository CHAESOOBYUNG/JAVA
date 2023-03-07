package verify.exam20;

import java.util.*;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			} 
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------");
		
		// scanner 입력창을 전부 nextLine으로 통일 하고
        // String으로 받은 금액 balance를 다시 Integer.parseInt를
        // 사용해서 int형으로 변환
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		String strBalance = scanner.nextLine();
		int balance = Integer.parseInt(strBalance);
		
		// scanner로 입력받은 사용자 정보를 아래의 객체로 생성
		Account account = new Account(ano,owner,balance);
		for(int i = 0; i < accountArray.length; i++ ) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		
		System.out.println("결과: 계좌가 생성되었습니다");
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------------------");
		System.out.println("계좌목록");
		System.out.println("--------------------");
		
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(accountArray[i] != null) {
				System.out.print(account.getAno() + "\t");
				System.out.print(account.getOwner() + "\t");
				System.out.print(account.getBalance() + "\t");
				System.out.println();
			} else { 
				break;
			}
			
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("예금");
		System.out.println("--------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		String strBalance = scanner.nextLine();
		int balance = Integer.parseInt(strBalance);
		
		Account account = findAccount(ano);
		
		if(account != null) {
			account.setBalance(account.getBalance() + balance);
			
			System.out.println("결과: 예금이 성공되었습니다");
		} else {
			System.out.println("결과: 예금에 실패하였습니다");
			return;
		}
		
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("출금");
		System.out.println("--------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		String strBalance = scanner.nextLine();
		int balance = Integer.parseInt(strBalance);
		
		Account account = findAccount(ano);
		
		if(account != null) {
			account.setBalance(account.getBalance() - balance);
			
			System.out.println("결과: 출금이 성공되었습니다");
		} else {
			System.out.println("결과: 출금에 실패하였습니다");
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String searchAno = accountArray[i].getAno();
				
				if(searchAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
