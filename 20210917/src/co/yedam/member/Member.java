package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸 �߱� �Ŵ絿(�ּ�)

	private String memberId;
	// public : member��� Ŭ���� �� �ܿ� �ٸ� Ŭ�������� ����ϵ��� ����
	// private : memberŬ���� �ܿ� ������� ���ϰ� �����
	private String name;
	private String address;

	// ������ : �ʵ鿡 ���� �ʱ�ȭ ��.
	public Member() { // member��� �����ڿ��ٰ�...
//		memberId = "user1";
//		name = "������";
//		address = "�뱸 �߱� ���ϵ�";
	}

	public Member(String mId) {
		memberId = mId;
		// memberId�� �ִ� ���� �־��ִ� �����ڸ� ����.

	}

	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}

	public void setMemberId(String mId) {
		memberId = mId; // ���� memberId�ʵ带 �ǹ���

	}

	public void setName(String n) {
		name = n; // setName�̶�� �޼ҵ带 n�ʵ忡�ٰ� ä���

	}

	public void setAddress(String a) {
		address = a;
	}

	public String getMemberId() {
		return memberId;
		// memberId�� �����ϵ��� �ϰڴ�..
	}

	public String getName() {
		return name; //��ȯ���ִ� �ʵ� : �̸�

	}

	public String getAddress() {
		return address; // ��ȯ���ִ� �ʵ� : �ּ�

	}

	public void showInfo() {
		System.out.println("���̵� : " + memberId + " , �̸� : " + name + ", �ּ� : " + address);
	}

	public void showName() {
		System.out.println("�̸� : " + name);
	}

	public void showAddress() {
		System.out.println("�ּ� : " + address);

	}

}
