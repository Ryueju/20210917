package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "박미리";
		m1.phone = "010-1234-5678";
		//m1은 세가지의 정보를 담게됨!
		
		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "박박수";
		m2.phone = "010-5588-8899";
		
		Member[] members = {m1,m2};
		
		for(Member member : members) {
			//같은 유형으로 받아와야함
			System.out.println("아이디 : " + member.memberId);
			System.out.println("이름 : " + member.name);
			System.out.println("연락처 : " + member.phone);
			
			
		}
		
		// m1 ==> members[0]
		m1.name = "김유림";
		members[0].phone = "010-5555-6666";
		for(Member member : members) {
			member.showInfo();
		}
		
		
		
	}
	
}
