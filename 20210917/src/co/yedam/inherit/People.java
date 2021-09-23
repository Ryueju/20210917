package co.yedam.inherit;

/*
 * 상속: 부모 > 자식에게 물려주는..
 */

public class People {

	
	private String name;
	private String ssn;
	
	public People() {
		
		
	}
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	
	}
	public void showInfo() {
		System.out.println("이름은 " + name + ", 주민번호 " + ssn);
	}
	@Override
	public String toString() {
		
	}
}
