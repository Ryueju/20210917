
package BankAccount;

//계좌 생성, 계좌목록, 예금, 출금, 종료
//이름,계좌번호,금액?
public class AccountInfo {

	private String ano;
	private String owner;
	private int balance;

	// 생성자 이름,계좌,금액
	public AccountInfo(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	// 메소드
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void showInfo() {
		System.out.printf("%s,  %s, %d \n ", getAno(), getOwner(), getBalance());
	}
	public void setBalace(int i) {
		// TODO Auto-generated method stub
		
	}

}
