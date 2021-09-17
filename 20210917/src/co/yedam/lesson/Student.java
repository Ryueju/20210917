package co.yedam.lesson;

public class Student {
	/*
	 * 학생이름, 학생 연락처, 학생 주소
	 */
		private String studentName;
		private String studentPhone;
		private String studentAddress;
		
		public Student(String name, String phone, String address) {
			this.studentName = name;
			this.studentPhone = phone;
			this.studentAddress = address;
			
		}
		
		public void setStudentName(String name) {
			this.studentName = name;
		}
		public void setPhone(String phone) {
			this.studentPhone = phone;
			
		}
		public void setAddress(String address) {
			this.studentAddress = address;
			
		}
		public String getStudentName() {
			return this.studentName;
		}
		public String getStudentPhone() {
			return this.studentPhone;
			
		}
		public String getStudentAddress() {
			return this.studentAddress;
			
		}
	}

