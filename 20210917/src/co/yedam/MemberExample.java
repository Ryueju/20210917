package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "�ڹ̸�";
		m1.phone = "010-1234-5678";
		//m1�� �������� ������ ��Ե�!
		
		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "�ڹڼ�";
		m2.phone = "010-5588-8899";
		
		Member[] members = {m1,m2};
		
		for(Member member : members) {
			//���� �������� �޾ƿ;���
			System.out.println("���̵� : " + member.memberId);
			System.out.println("�̸� : " + member.name);
			System.out.println("����ó : " + member.phone);
			
			
		}
		
		// m1 ==> members[0]
		m1.name = "������";
		members[0].phone = "010-5555-6666";
		for(Member member : members) {
			member.showInfo();
		}
		
		
		
	}
	
}
