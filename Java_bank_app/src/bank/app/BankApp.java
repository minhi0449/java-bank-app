package bank.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록  | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");
			
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2){
				accountList();
			}else if(selectNo == 3){
				deposit();
			}else if(selectNo == 4){
				withdraw();
			}else if(selectNo == 5){
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
    //	계좌생성 정적 메서드
	private static void createAccount() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.println("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = new Account(ano, owner, balance);
		accounts.add(account);
		System.out.println("계좌가 생성되었습니다");
		
		
	}
	
	//	계좌목록 정적 메서드
	private static void accountList(){
		
		for(Account account : accounts) {
			System.out.println("------------계좌목록--------------");
			System.out.println(account.getAno() + " " + 
			account.getOwner()+ " " + account.getBalance());
		}
		
	}
	
	//	입금 정적 메서드
	private static void deposit() {
		System.out.println("----------------예금----------------");
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.println("예금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		balance += findAccount(ano).getBalance();
		findAccount(ano).setBalance(balance);
		
		System.out.println("예금이 성공되었습니다.");
	}
	
	//	출금 정적 메서드
	private static void withdraw() {
		
		System.out.println("-------출금-------");
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.println("출금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		balance = findAccount(ano).getBalance() - balance;
		
		findAccount(ano).setBalance(balance);
		
		System.out.println("출금이 성공되었습니다.");
	}
	
	//	계좌검색 정적 메서드
	private static Account findAccount(String ano) {
		
		for (Account account : accounts) {
            if (account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
		
	}
	
	
	
	
}































