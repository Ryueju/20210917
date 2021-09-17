package co.yedam.lesson;

public class Lesson {
	private Teacher teacher;
			//Teacher라는 클래스
	private String group; // 이 선생님이 몇학년 몇반인지의 정보를 담고있음 (3-1)
	private Student[] students; //학생들의 배열
	
	public Lesson() {
		//Lesson은 필드의 초기값을 작업한 것
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
			//첫번째 값이 있는지없는지 확인하는..
			if(students[1] == null) { //비어있는지확인하고 비어있으면..빠져나와..?
				students[1] = student;
				break; //이게없으면 다 null로 채워짐
			} 
		}
		
	}
	public Teacher getTeacher() {
		//Teacher타입의 클래스를 리턴하겠습니다.
		return this.teacher;
		
	}
	public String getGroup() {
		return this.group;
	}
	public void showStudents() {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) { //null이 아니라면~
				
				System.out.println("이름: " + students[1].getStudentName() + " 연락처: "+ students[1].getStudentPhone() + " 주소: " + students[1].getStudentAddress());
			}
		}
	}
}

