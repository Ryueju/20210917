package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1 ", " �ڹ̸� ", "�뱸 �߱� ���ϵ� "); //������ ȣ���ϴ� ��
		//�ʵ带 ä��µ� ���� ������
		
		m1.showInfo();
//		m1.memberId = "user1";
		m1.setMemberId("user1"); //�� �޼ҵ带 ���ؼ� 
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "�뱸 �߱� ���ϵ�";
		m1.setAddress("�뱸 �߱� ���ϵ�");
		
//		System.out.println("���̵� : " + m1.memberId);
		System.out.println("���̵� : " + m1.getMemberId());
//		System.out.println("�̸� : " + m1.name);
		System.out.println("�̸� : " + m1.getName());
//		System.out.println("�ּ� : " + m1.address);
		System.out.println("�ּ� : " + m1.getAddress());
		
		Member m2 = new Member("user2", "������","�뱸 �޼��� ���ﵿ");
		m2.showInfo();
		m2.setName("������");
		m2.setAddress("�뱸 �޼��� ���ﵿ");
		
		Member m3 = new Member("user3 ", "ȫ�浿", "�뱸 �߱� ���ϵ�");
		m3.showInfo();
	//	m3.name = "�ڱ浿";
		m3.setName("�ڱ浿");		
		m3.showInfo(); //�̷��� �̸��� �ٲܼ��� ����!
		
		
		//�̷��� �ص������� ������ ������ �ʿ��ؼ� ���� ���������ϴ� ����
		//�����ڸ� �����ؼ� ä���ִ� �����ϱ�
		
	}
	
	

}
