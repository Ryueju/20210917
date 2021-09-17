package co.yedam.person;
/*
 * 이름, 키, 몸무게, 혈액형, 나이
 * 
 */
public class Person {
	
	private String personName;
	private String personHeight;
	private String personWeight;
	private String personBlood;
	private String personAge;
	
	public Person(String name, String height, String weight, String blood, String age) {
		this.personName = name;
		this.personHeight = height;
		this.personWeight = weight;
		this.personBlood = blood;
		this.personAge = age;
	

}
	public void setPersonName(String name) {
		this.personName =name;
	}
	public void setHeight(String height) {
		this.personHeight = height;
	}
	public void setWeight(String weight) {
		this.personWeight = weight;
	}
	public void setBlood(String blood) {
		this.personBlood = blood;
		
	}
	public void setAge(String age) {
		this.personAge = age;
	}
	public String getPersonName() {
		return this.personName;
	}
	public String getPersonHeight() {
		return this.personHeight;
	}
	public String getPersonWeight() {
		return this.personWeight;
	}
	public String getPersonBlood() {
		return this.personBlood;
	}
	public String getPersonAge() {
		return this.personAge;
	}
	
}
