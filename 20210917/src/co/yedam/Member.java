package co.yedam;

public class Member {
	// 필드
	int memberId;
	String name;
	String phone;
	
	// 메소드(기능)
	public void showInfo() {		//위에서 선언한 int memberId
		System.out.println("ID : " + memberId + ", 이름: " + name + ", 연락처: " + phone);
		
	}
}
