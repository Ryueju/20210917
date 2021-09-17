package co.yedam.lesson;

public class Lesson {
	private Teacher teacher;
			//Teacher��� Ŭ����
	private String group; // �� �������� ���г� ��������� ������ ������� (3-1)
	private Student[] students; //�л����� �迭
	
	public Lesson() {
		//Lesson�� �ʵ��� �ʱⰪ�� �۾��� ��
		students = new Student[3];
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setGroup(String group) {
		this.group = group;
		
	}
	public void addStudent(Student student) {
		for(int i=0; i<students.length; i++) {
			//ù��° ���� �ִ��������� Ȯ���ϴ�..
			if(students[1] == null) { //����ִ���Ȯ���ϰ� ���������..��������..?
				students[1] = student;
				break; //�̰Ծ����� �� null�� ä����
			} 
		}
		
	}
	public Teacher getTeacher() {
		//TeacherŸ���� Ŭ������ �����ϰڽ��ϴ�.
		return this.teacher;
		
	}
	public String getGroup() {
		return this.group;
	}
	public void showStudents() {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) { //null�� �ƴ϶��~
				
				System.out.println("�̸�: " + students[1].getStudentName() + " ����ó: "+ students[1].getStudentPhone() + " �ּ�: " + students[1].getStudentAddress());
			}
		}
	}
}

