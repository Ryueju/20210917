package co.yedam;

//0917 array ����
public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3};
		//�迭Ÿ���� ������ ������
		String[] strAry = {"Hello","World"};
		//���ڿ����������ִ� �迭�̴�
		int num = 10;
		
//		Student s1; //���� �Ҵ� �ȵ� ����
		Student s1 = new Student(); //name, score �ʵ带 ���� �� �ְԵ�
		s1.name = "ȫ�浿"; // s1�̶�� �ʵ忡 ȫ�浿�� �ְڴ�.
		s1.score = 80;
		
		Student s2 = new Student();
		//���Ӱ� name��score�� �����Ҽ� �ְԵ�
		s2.name = "��μ�";
		s2.score = 90;
		
		System.out.println("s1�л��̸�: "  + s1.name);
		System.out.println("s1�л�����: "  + s1.score);
		
		Student s3 = new Student();
		s3.name = "������";
		s3.score = 85;
		
		Student[] students = {s1, s2, s3};
				//studentŸ���� �����͸� ���� �Ǵ��� �� �ִ� �迭
		System.out.println("�迭 ù��°�� �̸� : " + students[0].name	);
													//=s1�� ����
		System.out.println("�迭 ù��°�� ���� : " + students[0].score);
		
		
		System.out.println("�迭 �ι�°�� �̸� : " + students[2].name	);
													//=s2�� ����
		System.out.println("�迭 �ι�°�� ���� : " + students[2].score);
		
		
		s1.name  = "�ڱ浿";
		s2.score = 70;
		//�ٲ� ���� �ȴ�.
		
		for(int i=0; i<students.length; i++) {
			System.out.println("�л��̸�: " + students[i].name);
			System.out.println("�л�����: " + students[i].score);

		}
			
	}
}
