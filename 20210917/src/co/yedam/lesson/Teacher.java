package co.yedam.lesson;

/*
 * 이름, 과목
 */

public class Teacher {
	//필드....
	private String name;
	private String major;
	
	
	//생성자....(여러개가능)
	public Teacher(String name, String major) {
		//생성자안에서는 매개값이 우선되기때문에
		//Teacher t1 = new Teacher(); => 공간을 만드는 것을 인스턴스를 생성한다고 함
		// 참조타입의 변수
		this.name = name;
		//생성자를통해서 값을 저장할수있도록 공간을 만들어주는 것
		this.major = major;
		
	}
	//메소드...(여러개가능)
	public void setName(String name) {
		this.name = name;
		//필드값을바꾸고싶으니깐
	}
	public void setMajor(String major) {
		this.major = major;
	}
	//값을 불러오는 메소드를 만들어주기
	
	public String getName() {
		return this.name;
		//반환해주는 구문이와야함 = return this.name;
		//this.@@@@ <필드
	}
	public String getMajor() {
		return this.major;
		
	}
}
