package BankAccount;

import java.util.Scanner;

public class AppMain {
	
	private static AppMain singleton = new AppMain();
	
	
	//������ private
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
		System.out.println("���»���");
		System.out.println("--------");
		
	//	String ano = readStr("���¹�ȣ : ");
	//	String owner = readStr("������ : ");
	//	int balance = readInt("�ʱ��Աݾ� : ");
	//	Account account = new Account(ano,owner,balance);
	//	for(int i = 0; i<accountArray.length; i++) {
	//		accountArray[i]=account;
	//		break;
		}
	}
}
