package Friend;


// 模备 捞抚,phone,email,虐,个公霸
public class Friend {
	
	
	//鞘靛
	private String name;
	private String phone;
	private String email;
	private int height;
	private int weight;
	
	//积己磊
	public Friend(String name, String phone, String email, int height, int weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
		
	}
	
	//皋家靛
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
		System.out.printf("*模备 捞抚 : %s, *模备 楷遏贸 : $s, *模备 email : $s, *模备 虐 : %d, *模备 个公霸 : %d \n", name, phone, email, height, weight);
		
	}

}
