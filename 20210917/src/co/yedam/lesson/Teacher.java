package co.yedam.lesson;

/*
 * �̸�, ����
 */

public class Teacher {
	//�ʵ�....
	private String name;
	private String major;
	
	
	//������....(����������)
	public Teacher(String name, String major) {
		//�����ھȿ����� �Ű����� �켱�Ǳ⶧����
		//Teacher t1 = new Teacher(); => ������ ����� ���� �ν��Ͻ��� �����Ѵٰ� ��
		// ����Ÿ���� ����
		this.name = name;
		//�����ڸ����ؼ� ���� �����Ҽ��ֵ��� ������ ������ִ� ��
		this.major = major;
		
	}
	//�޼ҵ�...(����������)
	public void setName(String name) {
		this.name = name;
		//�ʵ尪���ٲٰ�����ϱ�
	}
	public void setMajor(String major) {
		this.major = major;
	}
	//���� �ҷ����� �޼ҵ带 ������ֱ�
	
	public String getName() {
		return this.name;
		//��ȯ���ִ� �����̿;��� = return this.name;
		//this.@@@@ <�ʵ�
	}
	public String getMajor() {
		return this.major;
		
	}
}
