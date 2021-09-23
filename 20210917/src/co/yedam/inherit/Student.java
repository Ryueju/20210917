package co.yedam.inherit;


	public class Student extends People {
		private int studentNo;
		
		Student(String name, String ssn){
			super(name,ssn);
			
		
			
}
		Student(String name, String ssn, int studentNo){
			super(name,ssn); 
			this.studentNo = studentNo;
			
		}
		public int getStudentNo() {
			return studentNo;
			
		}
		//override
		@Override
		public void showInfo() {
			System.out.println("Name : " + super.getName()+", SSN" + this.getSsn() + ", SNO " + this.getStudentNo());
		}
		@Override
		public String toString() {
			return super.toString();
		}
}