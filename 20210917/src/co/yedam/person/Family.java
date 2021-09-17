package co.yedam.person;

public class Family {

	private Person person;
	private Person[] persons;
	private String family;
	public Family() {
		persons = new Person[3];
	}
	
	public void setPerson(Person person) {
		this.person = person;
		
	}
	public void setFamily(String family) {
		this.family = family;
		
	}
	public void addPerson(Person person) {
		for (int i=0; i<persons.length; i++){
			if(persons[i] == null) {
				persons[1] = person;
				break;
			}
		}
	
	System.out.println("이름: " + persons[1].getPersonName() + "나이 : " + persons[1].getPersonAge() +"혈액형 : " + persons[1].getPersonBlood());
	}
	

}

