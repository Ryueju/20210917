package BankAccount;

import java.util.Scanner;

public class Account {

	private static AccountInfo[] accountArray = new AccountInfo[100];
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0;

//	public Account(String ano, String owner, int balance) {
	// TODO Auto-generated constructor stub

	public static void main(String[] args) {
	
	boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1 계좌생성  |  2 계좌목록  |  3 예 금  |  4  출 금  |  5 종 료");
			System.out.println("--------------------------------------------------------");
			System.out.println("메뉴를 선택하세요 >>");

			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false;
				System.out.println("종료합니다.");
			} else {
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
	}
	private static void createAccount() {
		String ano = readStr("계좌번호 : ");
		String owner = readStr("예금주 : ");
		int balance = readInt("입금금액 : ");

		AccountInfo acc = new AccountInfo(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
	}

	private static void accountList() {
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] ==null) {
				break;
			}
				System.out.println(accountArray[i].getAno()+ " "+ accountArray[i].getOwner()+" "+ accountArray[i].getBalance());			
		}
	}
	
	private static void deposit() {
		String ano = readStr("계좌번호 : ");
		if (findAccount(ano) != null) {
			int balance = readInt("예금액 : ");
			findAccount(ano).setBalace(findAccount(ano).getBalance() + balance);
			System.out.println("예금이 완료되었습니다.");
		}

	}

	private static void withdraw() {
		String ano = readStr("계좌번호 : ");
		
		if (findAccount(ano) != null) {
			int balance = readInt("출금액 : ");
			int mon = findAccount(ano).getBalance() - balance;
			if (mon < 0) {
				System.out.println("출금 가능액을 초과하였습니다.");

			} else {
				findAccount(ano).setBalance(mon);
				System.out.println("출금 완료되었습니다.");
			}
		}
	}

	private static AccountInfo findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("찾으시는 계좌가 없습니다.");
		return null;
	}

	public static String readStr(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}

	public static int readInt(String msg) {
		System.out.print(msg);
		int result = 0;
		while (true) {
			String val = scanner.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다.");
				System.out.println("다시 입력해 주세요.");
			}
		}
		return result;
	}
}
