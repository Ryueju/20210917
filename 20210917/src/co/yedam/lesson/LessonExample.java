package co.yedam.lesson;
/*
 * ���� Ŭ���� + ���̺귯���� Ŭ���� ������ => ���α׷� ����
 * ��ü ����(�л�,������,��) => ��ü������
 * �л��̶�� ��ü-> �л� Ŭ������ ������
 * ��ҿ� -> new �л�(): �ν��Ͻ�.  < ���� �̺κ� ���� 1�� X
 *  
 */

public class LessonExample {
 public static void main(String[] agrs) {
	 Teacher t1 = new Teacher("ȫ�浿", "����");
	 		//t1�̶�� �������� ȫ�浿/������ ������ ���Ѱ� ��������..
	 Student s1 = new Student("��ҿ�", "010-1234-5678", "�뱸 �߱�");
	 Student s2 = new Student("������", "010-2255-6688", "�뱸 ����");
	 	
	 	// ������ - �л�1, �л�2, �л�3 ....
	 	//
	 Lesson l1 = new Lesson(); //l1�̶�� Ŭ���� ����
	 l1.setTeacher(t1);
	 l1.setGroup("3-1");
	 l1.addStudent(s1);
	 l1.addStudent(s2);
	 
	 Teacher t2 = l1.getTeacher(); //Teacher
	 System.out.println("������ �̸�: " + t2.getName());
	 System.out.println("������ ����: " + l1.getTeacher().getMajor());

	l1.showStudents();
	
 }
}
