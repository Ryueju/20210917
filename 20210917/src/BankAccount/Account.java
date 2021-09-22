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
			System.out.println("1 ���»���  |  2 ���¸��  |  3 �� ��  |  4  �� ��  |  5 �� ��");
			System.out.println("--------------------------------------------------------");
			System.out.println("�޴��� �����ϼ��� >>");

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
				System.out.println("�����մϴ�.");
			} else {
				System.out.println("�޴��� �ٽ� �����ϼ���");
			}
		}
	}
	private static void createAccount() {
		String ano = readStr("���¹�ȣ : ");
		String owner = readStr("������ : ");
		int balance = readInt("�Աݱݾ� : ");

		AccountInfo acc = new AccountInfo(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("���°� �����Ǿ����ϴ�.");
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
		String ano = readStr("���¹�ȣ : ");
		if (findAccount(ano) != null) {
			int balance = readInt("���ݾ� : ");
			findAccount(ano).setBalace(findAccount(ano).getBalance() + balance);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}

	}

	private static void withdraw() {
		String ano = readStr("���¹�ȣ : ");
		
		if (findAccount(ano) != null) {
			int balance = readInt("��ݾ� : ");
			int mon = findAccount(ano).getBalance() - balance;
			if (mon < 0) {
				System.out.println("��� ���ɾ��� �ʰ��Ͽ����ϴ�.");

			} else {
				findAccount(ano).setBalance(mon);
				System.out.println("��� �Ϸ�Ǿ����ϴ�.");
			}
		}
	}

	private static AccountInfo findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("ã���ô� ���°� �����ϴ�.");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
		return result;
	}
}
