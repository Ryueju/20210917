package Friend;


// 친구 이름,phone,email,키,몸무게
public class Friend {
	
	
	//필드
	private String name;
	private String phone;
	private String email;
	private int height;
	private int weight;
	
	//생성자
	public Friend(String name, String phone, String email, int height, int weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
		
	}
	
	//메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWegith() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void showInfo() {
		System.out.printf("[ 이름 : %s , 연락처 : %s , 메일 : %s, 키 : %d, 몸무게 : %d ] \n",name,phone,email,height,weight);
		
	}

}
