package co.yedam.inherit;

public class IndexOfExample {
	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		System.out.println(name.indexOf("�浵"));
		// indexOf("")<���� �ȿ� ���� ���ڰ� ������ 1��,
		// �׷��� ������ -1�� ���� ��ȯ����
		System.out.println(name.equals("�浿"));
		// equals > ã������ ���ڿ� name�̶�� �����ȿ� �ִ� ���ڰ� ������ true
		// �ٸ��� false�� ���� ��ȯ��

		
		System.out.println(name.indexOf("�浵") !=-1);
		System.out.println(name.equals("ȫ�浿"));

	}

}
