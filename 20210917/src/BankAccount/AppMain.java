package BankAccount;

import java.util.Scanner;

public class AppMain {
	
	private static AppMain singleton = new AppMain();
	
	
	//생성자 private
	private AppMain() {
		
	}
	
	public static AppMain genInstance() {
		return singleton;
	}

	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);
	static int num =0;
	
	public void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
	//	String ano = readStr("계좌번호 : ");
	//	String owner = readStr("계좌주 : ");
	//	int balance = readInt("초기입금액 : ");
	//	Account account = new Account(ano,owner,balance);
	//	for(int i = 0; i<accountArray.length; i++) {
	//		accountArray[i]=account;
	//		break;
		}
	}
}
